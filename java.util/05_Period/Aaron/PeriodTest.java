import java.time.LocalDate;
import java.time.Period;
import java.time.Month;

public class PeriodTest {
    public static void main(String[] args) { 
         LocalDate currentDate = LocalDate.now();
         LocalDate birthday = LocalDate.of(2015, Month.AUGUST, 22);
		 Period p = Period.between(birthday, currentDate);
         //minus 5 years
         p=p.minusYears(5);
         System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +" months, and " + p.getDays() + " days old."); 
    }
}
