package se.lexicon;
/*
Extra assignment
Create your own calendar for the year 2018.
 */
import java.util.Calendar;

public class Time17 {
    public void exerSeventeen() {

        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.YEAR, -4);

        System.out.println("Calendar's Year: " + calendar.get(Calendar.YEAR));
    }
}