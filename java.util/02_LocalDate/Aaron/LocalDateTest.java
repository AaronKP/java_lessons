import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDateTest {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.systemDefault();
   		LocalDate date =LocalDate.now(zone);   		 
   		System.out.println("today's Date is : " +date) ;
   		 
    }
}
