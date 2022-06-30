package se.lexicon;
/*
Exercise 13
Create a LocalDateTime with the date and time components as: date: 2018-04-05, time: 10.00.
 */
import java.time.LocalDateTime;

public class Time13 {
    public void exerThirteen() {

        LocalDateTime forenoon = LocalDateTime.of(2018,04,05,10,00);
        System.out.println(forenoon);
    }
}