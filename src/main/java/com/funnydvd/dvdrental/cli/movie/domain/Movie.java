package com.funnydvd.dvdrental.cli.movie.domain;

import com.funnydvd.dvdrental.cli.user.domain.User;

// 역할, 책임: 이 클래스는 하나의 DVD 정보를 저장할 수 있어야 한다.
public class Movie {

    private int serialNumber; // dvd 식별번호
    private String movieName; // dvd 영화명
    private String nation; // 영화 제작국가
    private int pubYear; // 발매년도
    private int charge; // 대여금액
    private boolean rental; // 대여상태
    private User rentalUser; // 현재 대여자 정보

    // 일련번호
    private static int sequence;

    // 생성자: (이 객체가 생성될때 사용자한테 받아야 할 정보가 무엇인가?)
    // movieName, nation, pubYear
    public Movie(String movieName, String nation, int pubYear) {
        this.serialNumber = ++sequence;
        this.movieName = movieName;
        this.nation = nation;
        this.pubYear = pubYear;
        this.charge = ChargePolicy.calculateDvdCharge(this.pubYear);
    }

    public User getRentalUser() {
        return rentalUser;
    }

    public void setRentalUser(User rentalUser) {
        this.rentalUser = rentalUser;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getPubYear() {
        return pubYear;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public boolean isRental() {
        return rental;
    }

    public void setRental(boolean rental) {
        this.rental = rental;
    }

    public static int getSequence() {
        return sequence;
    }

    public static void setSequence(int sequence) {
        Movie.sequence = sequence;
    }

    public String toString() {

        String rental = this.rental ? "대여중" : "대여가능";

        return String.format("### DVD번호: %s, 영화명: %s, 국가명: %s, 발매년도: %d, 대여료: %d, 대여상태: %s\n",
                serialNumber, movieName, nation, pubYear, charge, rental);
    }







}
