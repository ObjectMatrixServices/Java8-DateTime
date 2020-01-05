package com.datetime.local;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * The LocalDate represents a date in ISO format (yyyy-MM-dd) without time.
 * <p>
 * It can be used to store dates like birthdays and paydays.
 */
public class LocalDateSample {
    public static LocalDate getToday() {
        LocalDate today = LocalDate.now();
        return today;
    }

    static public LocalDate getTomorrowWithPlusDays() {
        LocalDate tomorrow = LocalDate.now()
                                      .plusDays(1);
        final LocalDate localDate = tomorrow.minusDays(4);
        return tomorrow;
    }

    public static LocalDate getTomorrowWithPlus() {
        final LocalDate tomorrow = LocalDate.now()
                                            .plus(-1, ChronoUnit.DAYS);
        return tomorrow;
    }

    public static LocalDate getTomorrowWithMinusDays() {
        return LocalDate.now()
                        .minusDays(-1);
    }

    public static LocalDate getTomorrowWithPlusPeriod() {
        return LocalDate.now()
                        .plus(Period.ofDays(1));
    }

    //This throws an Exception. Duration converts the number of days to number of seconds... And LocalDate
    public static LocalDate getTomorrowWithPlusDuration() {
        return LocalDate.now()
                        .plus(Duration.ofDays(1));
    }

    public static LocalDate getYesterdayWithPlusDays() {
        return LocalDate.now()
                        .plusDays(-1);
    }



    public static void main(String[] args) {
        //        LocalDate today = LocalDateSample.getToday();
        //        System.out.println("today = " + today);
        //
        //
        //
        //
        //        LocalDate d = LocalDate.of(2016, 12, 10);
        //        ValueRange r = d.range(ChronoField.DAY_OF_YEAR);
        //        System.out.printf("DAY_OF_YEAR: %s%n", r);

//        final LocalDate date = LocalDateSample.createDate();
//        System.out.println("date = " + date);

//        final LocalDate localDate =
//                LocalDateSample.createDateFromStringSpecificFormatterWIthBuilder();
//        System.out.println("localDate = " + localDate);


//        final LocalDate dateFromStringSpecificFormatter = LocalDateSample.createDateFromStringSpecificFormatterCustom();
//        System.out.println("dateFromStringSpecificFormatter = " + dateFromStringSpecificFormatter);

    }
}
