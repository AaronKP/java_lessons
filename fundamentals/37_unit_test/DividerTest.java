import org.junit.*;
import static org.junit.Assert.*;

public class DividerTest{

	Divider divider =new Divider();

	@Test
	public void testDivideByNegative(){
		assertEquals(-1,divider.divideByNegative(-1,1),0);
	}

	@Test
	public void testDivideByPositive(){
		assertEquals(1,divider.divideByPositive(1,1),0);
	}

	@Test
	public void testDivideByZero(){
		assertThrows(ArithmeticException.class, ()->{
			divider.divideByZero(1);
		});
	}
}