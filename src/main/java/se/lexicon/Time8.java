package se.lexicon;
/*
Exercise 8
Create a period of 4 years, 7 months and 29 days.
Then create a LocalDate of current date and add the period you created to the current date.
 */
import java.time.LocalDate;
import java.time.Period;

public class Time8 {
    public void exerEight() {

        LocalDate dateExer = LocalDate.parse("2023-06-30");//
        LocalDate newPeriod = LocalDate.parse("2028-02-10");//

        LocalDate today = LocalDate.now();

        Period period =  Period.between(dateExer, newPeriod);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println(years + " years, " + months + " months, " + days + " days.");
        System.out.println(today);
        System.out.println(years + " years, " + months + " months, " + days + " days. " + today);
    }
}