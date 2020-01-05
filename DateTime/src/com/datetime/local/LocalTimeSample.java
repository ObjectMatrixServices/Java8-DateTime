package com.datetime.local;

import java.time.LocalDate;
import java.time.LocalTime;

import static java.time.Month.APRIL;
import static java.time.Month.MAY;

public class LocalTimeSample {
    public static void main(String[] args) {
        final LocalTime localTime = LocalTime.ofSecondOfDay(2000);
        System.out.println("localTime = " + localTime);

        localTime.atDate(LocalDate.of(2018, APRIL, 21));
        localTime.atDate(LocalDate.of(2018, MAY, 21));


        final LocalTime of = LocalTime.of(23, 56);
        System.out.println("of = " + of);
    }
}
