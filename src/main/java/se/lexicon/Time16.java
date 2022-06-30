package se.lexicon;
/*
Exercise 16
Create a LocalDateTime object. Then get the LocalDate and LocalTime components
into separate objects of respective types from the LocalDateTime object.
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time16 {
    public void exerSixteen() {

        LocalDate date = LocalDate.parse("2022-05-04");
        LocalTime time = LocalTime.parse("14:15:16");
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        String custom1 = dateTime.format(DateTimeFormatter.ISO_DATE);
        String custom2 = dateTime.format(DateTimeFormatter.ISO_TIME);

        System.out.println(custom1 + "  " + custom2);
    }
}