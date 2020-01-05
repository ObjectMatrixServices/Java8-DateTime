package com.datetime.local;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ofLocalizedDate;
import static java.time.format.DateTimeFormatter.ofPattern;
import static java.time.format.FormatStyle.FULL;
import static java.time.format.FormatStyle.LONG;
import static java.time.format.FormatStyle.MEDIUM;
import static java.time.format.FormatStyle.SHORT;

public class LocalDateTimeDisplayFormat {

    public static final String INDIAN_DATE_FORMAT = "dd/MM/yyyy";

    public  static void formatInHumanReadableFormat(){
        LocalDate anotherSummerDay = LocalDate.of(2016, 8, 23);
        System.out.println(ofLocalizedDate(FULL).format(anotherSummerDay));
        System.out.println(ofLocalizedDate(LONG).format(anotherSummerDay));
        System.out.println(ofLocalizedDate(MEDIUM).format(anotherSummerDay));
        System.out.println(ofLocalizedDate(SHORT).format(anotherSummerDay));

        final DateTimeFormatter dateTimeFormatter = ofPattern(INDIAN_DATE_FORMAT);
        final String format = dateTimeFormatter.format(anotherSummerDay);
        System.out.println("format = " + format);
    }

    public static void main(String[] args) {
        LocalDateTimeDisplayFormat.formatInHumanReadableFormat();
    }
}
