package ducks;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.InputStream;

public class MainTest {

    @Test
    void testMain() {

        //given
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String input = "3 5\n1 2\n2 3\n5 4\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        //when
        Main.main(new String[]{}); // execute the main method of the Main class without any command line arguments

        //then
        String expectedOutput = "5" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
