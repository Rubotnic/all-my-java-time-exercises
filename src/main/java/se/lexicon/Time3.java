package se.lexicon;
/*Exercise3:
Create a LocalDate of last Monday. Then print out the entire week in a loop using standard ISO format.
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Time3 {
    public void exerThree() {

        LocalDate startWeek = LocalDate.of(2022, 06, 20);

        LocalDate tuesday = startWeek.plusDays(1);
        LocalDate wednesday = startWeek.plusDays(2);
        LocalDate thursday = startWeek.plusDays(3);
        LocalDate friday = startWeek.plusDays(4);
        LocalDate saturday = startWeek.plusDays(5);
        LocalDate sunday = startWeek.plusDays(6);

        System.out.println("All days of week 25 starts: " + "\n" + startWeek.format(DateTimeFormatter.ISO_LOCAL_DATE)
                + "\n" + tuesday + "\n" + wednesday + "\n" + tuesday + "\n" + thursday + "\n" + friday + "\n" + saturday + "\n" + sunday);
    }
}