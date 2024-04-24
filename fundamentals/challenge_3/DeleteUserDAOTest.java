import org.junit.*;
import static org.junit.Assert.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DeleteUserDAOTest {

    @ParameterizedTest
    @CsvSource({
            "aaronkpadiachy98@gmail.com"
            // Add more test data as needed. Each "" represents a set of test data. "," means 2 params
    })
    public void testDelete(String email) {
        UserDAO.delete(email);
        assertNull(UserDAO.getUserByEmail(email)[0]);
    }
}

