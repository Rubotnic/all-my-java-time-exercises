package se.lexicon;
/*
Exercise2:
Create a LocalDate of the current day and print it out in the following pattern using DateTimeFormatter:
Torsdag 29 mars.
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Time2 {
    public void exerTwo() {

        LocalDate anotherSummerDay = LocalDate.of(2016, 3, 29);
        System.out.println("Torsdag" + anotherSummerDay.format(DateTimeFormatter.ofPattern(" dd MMMM.")));
    }
}