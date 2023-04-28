package com.format.dates;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();


        String date1 = dateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println(date1);

        String date2 = dateTime.format(DateTimeFormatter.ofPattern("yyy-MM-dd"));
        System.out.println(date2);

        String date3 = dateTime.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy"));
        System.out.println(date3);

        String date4 = dateTime.format(DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy hh:mma"));
        System.out.println(date4);

        String date5 = dateTime.format(DateTimeFormatter.ofPattern("h:mm 'on' dd-MM-yyyy"));
        System.out.println(date5);

    }
}
