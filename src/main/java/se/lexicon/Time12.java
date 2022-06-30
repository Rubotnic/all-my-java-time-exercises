package se.lexicon;
/*
Exercise 12
Using DateTimeFormatter format LocalTime from current time and print it out as following pattern:
10:32:53
 */
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time12 {
    public void exerTwelve() {

        LocalTime correntTime = LocalTime.parse("10:32:53");

        String custom = correntTime.format(DateTimeFormatter.ISO_TIME);
        System.out.println(custom);
    }
}