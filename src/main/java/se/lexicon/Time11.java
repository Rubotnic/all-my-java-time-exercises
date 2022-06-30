package se.lexicon;
/*
Exercise 11
Create a LocalTime object from a String using the .parse() method.
 */
import java.time.LocalTime;
public class Time11 {
    public void exerEleven() {

        LocalTime time = LocalTime.parse("14:15:16");

        System.out.println("Local time: " + time);
    }
}