package com.datetime.local;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

/**
 * Shows various ways of creating LocalDate instances including from different formats.
 */
public class LocalDateCreatorSample {
    public static LocalDate createDate() {
        //     final LocalDate d = LocalDate.of(2015, Month.JANUARY, 20);
        final LocalDate d = LocalDate.of(2015, 4, 20);
        return d;
    }

    public static LocalDate createDateFromStringDefaulFormatter(){
        final LocalDate parse = LocalDate.parse("0201-06-12");
        return parse;
    }

    public static LocalDate createDateFromStringSpecificFormatterWIthBuilder(){

//        Day is:9, month is:12, and year:2019


        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        DateTimeFormatter formatter = builder.appendLiteral("Day is:")
                                             .appendValue(ChronoField.DAY_OF_MONTH)
                                             .appendLiteral(", month is:")
                                             .appendValue(ChronoField.MONTH_OF_YEAR)
                                             .appendLiteral(", and year:")
                                             .appendPattern("u")
                                             //                                             .appendLiteral(" with the time:")
                                             //                                             .appendValue(ChronoField.HOUR_OF_DAY)
                                             //                                             .appendLiteral(":")
                                             //                                             .appendText(ChronoField.MINUTE_OF_HOUR, TextStyle.NARROW_STANDALONE)
                                             .toFormatter();
        //        LocalDateTime dateTime  = LocalDateTime.now();
        //        String str =  dateTime.format(formatter);
        //        System.out.println(str);
        final LocalDate parse = LocalDate.parse("Day is:9, month is:12, and year:2017", formatter);
        return parse;
    }

    public static LocalDate createDateFromStringSpecificFormatterPredefined(){
        final LocalDate parse = LocalDate.parse("20131206", DateTimeFormatter.BASIC_ISO_DATE);
        return parse;
    }

    public static LocalDate createDateFromStringSpecificFormatterCustom(){
        String europeanDatePattern = "dd/MM/yyyy";
        DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
        final LocalDate parse = LocalDate.parse("21/03/2019", europeanDateFormatter);
        return parse;
    }

    public static void main(String[] args) {
//        final LocalDate createDate = LocalDateCreatorSample.createDate();
//        System.out.println("createDate = " + createDate);

        final LocalDate dateFromStringDefaulFormatter = LocalDateCreatorSample.createDateFromStringDefaulFormatter();
        System.out.println("dateFromStringDefaulFormatter = " + dateFromStringDefaulFormatter);

//        final LocalDate dateFromStringSpecificFormatterPredefined =
//                LocalDateCreatorSample.createDateFromStringSpecificFormatterPredefined();
//
//        System.out.println("dateFromStringSpecificFormatterPredefined = " + dateFromStringSpecificFormatterPredefined);

//        final LocalDate dateFromStringSpecificFormatterCustom =
//                LocalDateCreatorSample.createDateFromStringSpecificFormatterCustom();
//        System.out.println("dateFromStringSpecificFormatterCustom = " + dateFromStringSpecificFormatterCustom);

//        final LocalDate dateFromStringSpecificFormatterWIthBuilder =
//                LocalDateCreatorSample.createDateFromStringSpecificFormatterWIthBuilder();
//        System.out.println("dateFromStringSpecificFormatterWIthBuilder = " + dateFromStringSpecificFormatterWIthBuilder);
    }

}
