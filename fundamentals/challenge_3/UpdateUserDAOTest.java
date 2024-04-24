import org.junit.*;
import static org.junit.Assert.*;

public class UpdateUserDAOTest{
	@Test
	public void testUpdate(){
		
		UserDAO.userDB[0][0]="adsfsgd";
		UserDAO.userDB[0][1]="adsfsgd";
		UserDAO.userDB[0][2]="adsfsgd";
		UserDAO.userDB[0][3]="aaronkpadiachy98@gmail.com";
		UserDAO.userDB[0][4]="adsfsgd";

		UserDAO.getUpdates("aaronkpadiachy98@gmail.com");
		assertEquals("Update not successful","Aaron",UserDAO.userDB[0][0]);
	}
}