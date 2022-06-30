package se.lexicon;
/*
Exercise6
Create a LocalDate of current date plus 10 years and minus 10 months.
From that date extract the month and print it out.
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class Time6 {
    public void exerSix() {

        LocalDate today = LocalDate.now();

        LocalDate plusYear = today.plus(10, ChronoUnit.YEARS);

        LocalDate minusMonths = plusYear.minus(10,ChronoUnit.MONTHS );

        System.out.println(DateTimeFormatter.ofPattern("LLLL").format(minusMonths));
    }
}