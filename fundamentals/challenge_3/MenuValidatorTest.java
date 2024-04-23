import org.junit.*;
import static org.junit.Assert.*;

public class MenuValidatorTest{

	@Test
	public void testValidateMenuOpt(){
		assertEquals(false,MenuValidator.validateMenuOpt("a"));
	}
	
}