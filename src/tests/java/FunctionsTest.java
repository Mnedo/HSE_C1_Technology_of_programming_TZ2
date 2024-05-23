
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NumberProcessorTest {
    @Test
    public void testMin() {
        int[] numbers = {11, 2, 24, 6};
        assertEquals(2, Main._min(numbers));
    }

    @Test
    public void testMax() {
        int[] numbers = {11, 2, 24, 6};

        assertEquals(24, Main._max(numbers));
    }

    @Test
    public void testSum() {
        int[] numbers = {11, 2, 24, 6}};
        assertEquals(43, Main._sum(numbers));
    }

    @Test
    public void testMult() {
        int[] numbers = {-3, -11, 1};
        assertEquals(33, Main._mult(numbers));
    }
}
