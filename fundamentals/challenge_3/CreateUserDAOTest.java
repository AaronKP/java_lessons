import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CreateUserDAOTest{

	@Test
	public void setNameTest(){
		UserDAO.setName();
		assertEquals("Name not set","Aaron",UserDAO.getName());
	}
	@Test
	public void setSurnameTest(){
		UserDAO.setSurname();
		assertEquals("Surname not set","Padiachy",UserDAO.getSurname());
	}
	@Test
	public void setDoBTest(){
		UserDAO.setDoB();
		assertEquals("DoB not set","22/12/1998",UserDAO.getDoB());
	}
	@Test
	public void setEmailTest(){
		UserDAO.setEmail();
		assertEquals("Email not set","aaronkpadiachy98@gmail.com",UserDAO.getEmail());
	}
	@Test
	public void setIdTest(){
		UserDAO.setId();
		assertEquals("ID not set","1234567891234",UserDAO.getId());
	}

	@Test
	public void testCreate(){
		UserDAO.create(UserDAO.getName(),UserDAO.getSurname(),UserDAO.getDoB(),UserDAO.getEmail(),UserDAO.getId());
		assertEquals("DB not populated",1,UserDAO.userDB.length);
	}
}