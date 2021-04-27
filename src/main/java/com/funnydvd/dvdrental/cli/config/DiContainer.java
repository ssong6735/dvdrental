package com.funnydvd.dvdrental.cli.config;

import com.funnydvd.dvdrental.cli.movie.controller.MovieController;
import com.funnydvd.dvdrental.cli.movie.repository.JdbcMovieRepository;
import com.funnydvd.dvdrental.cli.movie.repository.MemoryMovieRepository;
import com.funnydvd.dvdrental.cli.movie.repository.MovieRepository;
import com.funnydvd.dvdrental.cli.order.controller.OrderController;
import com.funnydvd.dvdrental.cli.order.repository.MemoryOrderRepository;
import com.funnydvd.dvdrental.cli.user.controller.UserController;
import com.funnydvd.dvdrental.cli.user.repository.MemoryUserRepository;
import com.funnydvd.dvdrental.cli.user.repository.UserRepository;

// 역할: 객체를 생성해서 필요에 맞는 구현체를 주입해주는 책임을 가진 클래스
// 스프링에서는 아래 코드들을 직접 생성해준다.
public class DiContainer {

    // MovieRepository Bean 등록
    public MovieRepository movieRepository() {
        return new MemoryMovieRepository();
    }

    // MovieController 에 의존성 주입
    public MovieController movieController() {
//        return new MovieController(new MemoryMovieRepository());
//        return new MovieController(new JdbcMovieRepository());
        return new MovieController(movieRepository()); // Bean 등록후 변경 코드
    }

    // OrderController 에 의존성 주입
    public OrderController orderController() {
        return new OrderController(
                new MemoryUserRepository(),
//                new MemoryMovieRepository(),
                movieRepository(), // Bean 등록후 변경 코드
                new MemoryOrderRepository()
        );
    }

    // UserController 에 의존성 주입
    public UserController userController() {
        return new UserController(new MemoryUserRepository());
    }

}
