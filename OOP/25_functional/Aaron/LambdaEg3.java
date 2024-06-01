import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaEg3 {
   public static void main(String[] args) {
       List<String> friends =
               new ArrayList<String>(Arrays.asList("1brian", "nate", "neal", "raju", "sara", "sott"));

       friends.forEach(e -> System.out.println(e.toUpperCase()));
       
   }
}
