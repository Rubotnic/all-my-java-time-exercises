package se.lexicon;
/*
Exercise 4:
Create a LocalDate object from a String by using the .parse() method.
 */
import java.time.LocalDate;

public class Time4 {
    public void exerFour() {

        LocalDate local = LocalDate.parse("2022-05-05");
        System.out.println("Date: " + local);
    }
}