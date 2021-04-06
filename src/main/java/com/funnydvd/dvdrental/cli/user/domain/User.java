package com.funnydvd.dvdrental.cli.user.domain;

import static com.funnydvd.dvdrental.cli.user.domain.Grade.*;

public class User {

    private static int sequence; // 회원 순차번호

    private int userNumber; // identifier 회원번호
    private String userName; // 회원명
    private String phoneNumber; // 전화번호
    private int totalPaying; // 누적결제액
    private Grade grade; // 회원등급

    // 회원 가입시 처음 처리 생성자
    public User(String userName, String phoneNumber) {
        this.userNumber = ++sequence;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.grade = BRONZE;
    }


    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getTotalPaying() {
        return totalPaying;
    }

    public void setTotalPaying(int totalPaying) {
        this.totalPaying = totalPaying;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }



    // toString
    @Override
    public String toString() {
        return  "## 회원번호: " + userNumber +
                ", 회원명: " + userName +
                ", 전화번호: " + phoneNumber  +
                ", 총 결제금액: " + totalPaying + "원" +
                ", 등급: " + grade;
    }
}
