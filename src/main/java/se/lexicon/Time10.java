package se.lexicon;
/*
Exercise 10
Extract the nanoseconds of a LocalTime object of current time. Print out the nanoseconds.
 */
import java.time.LocalTime;

public class Time10 {
    public void exerTen() {

        LocalTime currentTime = LocalTime.now();

        int nonoSecond = currentTime.getNano();
        System.out.println(nonoSecond);
    }
}