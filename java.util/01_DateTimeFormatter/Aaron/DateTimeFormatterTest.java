import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
 

public class DateTimeFormatterTest{
   public static void main(String [] args){

      LocalDateTime now = LocalDateTime.now();

      System.out.println("Before : " + now);

      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD-YY-MM");

      String formatDateTime = now.format(formatter);

      System.out.println("After : " + formatDateTime);
   }
}
