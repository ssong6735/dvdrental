package com.funnydvd.dvdrental.cli.movie.repository;

import com.funnydvd.dvdrental.cli.movie.domain.Movie;
import com.funnydvd.dvdrental.cli.movie.domain.SearchCondition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JdbcMovieRepositoryTest {

    private MovieRepository repository = new JdbcMovieRepository();

    @Test
    @DisplayName("검색 조건에 맞게 sql이 완성되어야 하며 결과를 잘 조회해야 한다.")
    void searchTest() {
        List<Movie> movieList = repository.searchMovieList("미국", SearchCondition.POSSIBLE);
        movieList.forEach(m -> System.out.println(m));
    }

}