package se.lexicon;
/*
Exercise 14
Using DateTimeFormatter format the LocalDateTime object
from exercise 11 to a String that should look tile this: torsdag 5 april 10:00
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time14 {
    public void exerFourteen() {

        LocalDate date = LocalDate.parse("2022-05-04");
        LocalTime time = LocalTime.parse("14:15:16");
        LocalDateTime dateTime = LocalDateTime.of(date,time);

        String custom = dateTime.format(DateTimeFormatter.ofPattern("eeee d MMM HH:mm"));
        System.out.println(custom);
    }
}