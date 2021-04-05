package com.funnydvd.dvdrental.cli.movie.domain;

import java.time.LocalDate;

/**
 * 요금정책
 * 1. 올해 출시된 영화는 기본적으로 5000원
 * 출시 후 1년이 지날때마다 500원씩 할인
 * 최소 요금은 2000원이며 그 밑으로는 할인하지 않는다.
 */

public class ChargePolicy {

    // 요금관련 상수
    private static final int BASE_CHARGE = 5000;
    private static final int DISCOUNT = 500;
    private static final int LIMIT_CHARGE = 2000;

    // 영화 요금을 계산해서 리턴하는 기능
    public static int calculateDvdCharge(int pubYear) {
        // 올해 연도 정보
        int thisYear = LocalDate.now().getYear();
        // 출시 후 경과년도 계산
        int movieAge = thisYear - pubYear;
        // 요금 계산
        int charge = BASE_CHARGE - (movieAge * DISCOUNT);
        // 최대 할인요금 최저요금으로 고정
        if (charge < LIMIT_CHARGE) {
            return LIMIT_CHARGE;
        }
        return charge;
    }



}
