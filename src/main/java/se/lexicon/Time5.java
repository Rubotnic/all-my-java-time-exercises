package se.lexicon;
/*
Exercise 5
The date time api provides enums for time units such as day and month.
Create a LocalDate of 1945-05-08 and extract the day of week for that date.
*/
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Time5 {
    public void exerFive() {

        LocalDate oldYear = LocalDate.parse("1945-05-08");
        System.out.println(oldYear.format(DateTimeFormatter.ofPattern("eeee")));
    }
}