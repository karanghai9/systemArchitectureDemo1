import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class AdditionTest {
	@Test
	public void test() {
        assertEquals(5, Addition.add(2, 3));
        assertEquals(-8, Addition.add(-5, -3));
        assertEquals(0, Addition.add(0, 0));
        assertEquals(15, Addition.add(10, 5));
	}
}