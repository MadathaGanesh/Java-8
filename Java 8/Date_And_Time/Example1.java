package Date_And_Time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;

public class Example1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Printing LocalDate using LocalDate :" + date);

        LocalTime time = LocalTime.now();
        System.out.println("printing Localtime using LocalTime : " + time);

        LocalDateTime obj = LocalDateTime.now();
        System.out.println("Printing LocalDateTime using LocalDateTime : " + obj);

        LocalDate specificDate = LocalDate.of(2024, 9, 28);
        System.out.println("Printing date by specifying it :" + specificDate);

        LocalTime spectificTime = LocalTime.of(23, 30, 40, 300);
        System.out.println("Printing specific time : " + spectificTime);

        ZonedDateTime zonedetails = ZonedDateTime.now();
        System.out.println("Printing with zone details are : " + zonedetails);

        // Printing difference between the years and months
        // Period is used to calculate difference b/w dates
        LocalDate oldDate = LocalDate.of(2002, 9, 8);
        LocalDate today = LocalDate.now();
        Period difference = Period.between(today, oldDate);
        System.out.println("Difference between dates using Period is : " + difference);

        // Printing difference b/w times
        LocalTime oldTime = LocalTime.of(10, 10, 10);
        LocalTime now = LocalTime.now();
        Duration TimeDiff = Duration.between(oldTime, now);
        System.out.println("Time difference using Duration is : " + TimeDiff);

        // Printing Timestamp using Instant
        Instant timeStamp = Instant.now();
        System.out.println("Printing TimeStamp using Instant Method is : " + timeStamp);

    }

}
