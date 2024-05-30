import java.util.function.*;

public class Main{
	public static void main(String[] args) {
		Supplier<String> supplier = ()-> "I am a supplier";
		System.out.println(supplier.get());

		Supplier<Integer> integerSupplier = ()->100;
		System.out.println(integerSupplier.get());

		IntSupplier inPrimitiveSupplier = ()->47;
		System.out.println(inPrimitiveSupplier.getAsInt());

		Consumer<String> stringConsumer = (conString)->System.out.println(conString);
		stringConsumer.accept("I am a consumer");

		Consumer<Integer> integerConsumer = (myInteger)->System.out.println(myInteger);
		integerConsumer.accept(35);

		IntConsumer inPrimitiveConsumer = (inprim)->System.out.println(inprim);
		inPrimitiveConsumer.accept(97);

		Predicate<String> stringColorTester = (color1)->color1.equals("blue");
		System.out.println(stringColorTester.test("brown"));

		Function<String,Integer> lengthFinderFunction = (stringLength)->stringLength.length();
		System.out.println("String length: "+lengthFinderFunction.apply("FunctionLength"));
	}
}