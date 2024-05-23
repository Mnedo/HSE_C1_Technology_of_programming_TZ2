import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testMain() throws Exception {
        String data = "2 4 17 31";
        Files.write(Paths.get("filik.txt"), data.getBytes());

        ByteArrayOutputStream res = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main.main(new String[] {"filik.txt"});

        String out = "Считали файл! Искомые значения:\n" +
                                "Минимальное:\n" +
                                "2\n" +
                                "Максимальное:\n" +
                                "31\n" +
                                "Сумма:\n" +
                                "54\n" +
                                "Произведение:\n" +
                                "4216\n";

        assertEquals(out, res.toString());
    }
}
