
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.Arrays;

public class PerformanceTest {

    @Test
    public void testPerformance() {
        int[] largeArray = new int[1000000];
        Arrays.fill(largeArray, 1);

        assertTimeout(Duration.ofSeconds(1), () -> {
            Main._min(largeArray);
            Main._max(largeArray);
            Main._sum(largeArray);
            Main._mult(largeArray);
        });
    }
}
