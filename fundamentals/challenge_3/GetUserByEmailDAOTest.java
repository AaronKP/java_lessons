import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GetUserByEmailDAOTest{

	@Test
	public void testGetUserByEmail(){
		UserDAO.userDB[0][3]="aaronkpadiachy98@gmail.com";
		assertEquals("Email not found","aaronkpadiachy98@gmail.com",UserDAO.getUserByEmail("aaronkpadiachy98@gmail.com")[3]);
	}
}