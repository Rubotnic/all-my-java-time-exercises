package se.lexicon;
/*
Exercise 1:
Create a LocalDate of the current day and print it out
 */
import java.time.LocalDate;

public class Time1 {
    public void exerOne(){

        LocalDate today = LocalDate.now();
        System.out.println(today);
    }
}