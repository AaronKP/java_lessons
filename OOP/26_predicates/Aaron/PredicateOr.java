import java.util.function.*;

public class PredicateOr{
	public static void main(String[] args) {
		Predicate<Integer> isNameLength5 = (l)->l==5;
		Predicate<Integer> ageGreater20 = (age)-> age>20;
		Predicate<Integer> isNameLength5ORageAgegreater20 = isNameLength5.or(ageGreater20);
		boolean resultOr = isNameLength5ORageAgegreater20.test("Aaron".length());
		System.out.println("result Predicate.or(): "+resultOr);

		Predicate<String> isNameLength4 = (l)->l.length()==5;
		Predicate<String> startsWithA  = (n)->n.startsWith("K");
		Predicate<String> isNameLength5ANDstartsWithA = isNameLength4.and(startsWithA);
		boolean resultAnd = isNameLength5ANDstartsWithA.test("Kyle");
		System.out.println("result Predicate.and(): "+resultAnd);
	}
		

		
}