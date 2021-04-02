package com.funnydvd.dvdrental.cli.movie.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @Test
    @DisplayName("Movie 객체를 생성할때마다 시퀀스가 자동으로 증가해야 한다.")
    void secuencePlus() {

        // given (테스트할 데이터를 준다.)
        Movie movie1 = new Movie("타이타닉", "미국", 1998);
        Movie movie2 = new Movie("기생충", "대한민국", 2019);
        Movie movie3 = new Movie("인터스텔라", "미국", 2014);

        // when
        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie3);

        // then (assertTrue: 참이라고 단언하다)
        Assertions.assertTrue(movie1.getSerialNumber() == 1);
        Assertions.assertTrue(movie2.getSerialNumber() == 2);
        Assertions.assertTrue(movie3.getSerialNumber() == 3);


    }


}