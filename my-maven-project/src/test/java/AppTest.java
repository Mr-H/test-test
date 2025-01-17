import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AppTest {

    @Test
    public void testAddMethod() {
        int result = App.add(1, 2);
        assertEquals(3, result);
    }

    @Test
    public void testSubtractMethod() {
        int result = App.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiplyMethod() {
        int result = App.multiply(4, 2);
        assertEquals(8, result);
    }

    @Test
    public void testDivideMethod() {
        int result = App.divide(8, 2);
        assertEquals(4, result);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            App.divide(8, 0);
        });
    }
}