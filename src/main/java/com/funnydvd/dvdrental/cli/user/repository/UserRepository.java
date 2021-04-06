package com.funnydvd.dvdrental.cli.user.repository;

import com.funnydvd.dvdrental.cli.user.domain.User;

import java.util.List;

public interface UserRepository {

    // 회원 가입 기능
    void addUser(User user);

    // 회원 목록 조회 기능
    List<User> findAllByName(String userName);

    // 회원 개별 조회 (시스템적으로 사용하려고 만듬)
    User findByUserNumber(int userName);

    // 회원 탈퇴 기능
    User deleteUser(int userNumber);


}
