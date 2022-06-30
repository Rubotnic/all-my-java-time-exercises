package se.lexicon;
/*
Exercise 15
Create a LocalDateTime object by combining LocalDate object and LocalTime object.
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time15 {
    public void exerFifteen() {

        LocalDate date = LocalDate.parse("2022-05-04");
        LocalTime time = LocalTime.parse("14:15:16");
        LocalDateTime dateTime = LocalDateTime.of(date,time);

        System.out.println(dateTime);
    }
}