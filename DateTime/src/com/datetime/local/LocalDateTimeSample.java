package com.datetime.local;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.stream.Stream;

import static java.time.Month.MAY;
import static java.time.format.TextStyle.FULL;


public class LocalDateTimeSample {
    public static void getDateTimeNow(){
        final LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now.toString());
    }

    public static void main(String[] args) {
        //May 12, 2001 @ 1:04.32.094 am
        //        final LocalDateTime dt1 = LocalDateTime.of(2001, MAY, 12, 1, 4);
        //        final DayOfWeek dayOfWeek = dt1.getDayOfWeek();
        //        final String displayName = dayOfWeek.getDisplayName(SHORT, US);
        //        System.out.println("displayName = " + displayName);
        //        System.out.println("dayOfWeek = " + dayOfWeek);
        //        System.out.println("dt1 = " + dt1);
        //        final LocalDateTime dt2 = LocalDateTime.of(2001, MAY, 12, 1, 4, 32);
        //        System.out.println("dt2 = " + dt2);
        //        final LocalDateTime dt3 = LocalDateTime.of(2001, MAY, 12, 1, 4, 32, 94);
        //        System.out.println("dt3 = " + dt3);


        final Locale[] availableLocales = Locale.getAvailableLocales();
        Stream.of(availableLocales)
              .forEachOrdered(e -> displayDateInDiffLocales(e));
    }

    private static void displayDateInDiffLocales(Locale e) {
        final LocalDateTime dt1 = LocalDateTime.of(2001, MAY, 12, 1, 4);
        final DayOfWeek dayOfWeek = dt1.getDayOfWeek();
        String displayName = dayOfWeek.getDisplayName(FULL, e);
        System.out.println("In Language " + e.getDisplayLanguage() + " and Country "+ e.getDisplayCountry() + " = " + displayName);
    }
}
