package se.lexicon;
/*
Exercise 7
Using the LocalDate from exercise 6 and your birthdate,
create a Period between your birthdate and the date from exercise 5.
Print out the elapsed years, months and days.
 */
import java.time.LocalDate;
import java.time.Period;

public class Time7 {
    public void exerSeven() {

        LocalDate dateExer = LocalDate.parse("2031-08-06");//

        LocalDate pastYear = LocalDate.parse("1945-05-08");// exe 5

        LocalDate myBirthday = LocalDate.parse("1980-08-05");// birthday

        Period period =  Period.between(pastYear, myBirthday);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println(years + " years, " + months + " months, " + days + " days.");
    }
}