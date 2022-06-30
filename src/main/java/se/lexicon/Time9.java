package se.lexicon;
/*
Exercise2:
Exercise 9
Create a LocalTime object of the current time.
 */
import java.time.LocalTime;

public class Time9 {
    public void exerNine() {

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
    }
}