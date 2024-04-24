import org.junit.*;
import static org.junit.Assert.*;

public class FindAllUsersDAOTest{

	@Test
	public void testFindAll(){

		UserDAO.userDB[0][0]="Aaron";
		UserDAO.userDB[0][1]="adsfsgd";
		UserDAO.userDB[0][2]="adsfsgd";
		UserDAO.userDB[0][3]="aaronkpadiachy98@gmail.com";
		UserDAO.userDB[0][4]="adsfsgd";


		assertEquals("Can't return all","Aaron",UserDAO.findAll()[0]);
	
	}
}