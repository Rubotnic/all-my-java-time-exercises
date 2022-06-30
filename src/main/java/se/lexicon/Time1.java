package se.lexicon;
/*
Exercise 1:
Create a LocalDate of the current day and print it out
 */
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Time1 {
    public void exerOne(){

        LocalDate dayWeek = LocalDate.now();
        DayOfWeek day = dayWeek.getDayOfWeek();

        System.out.println(day);
    }
}