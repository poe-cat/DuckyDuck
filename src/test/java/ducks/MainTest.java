package ducks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Scanner;

public class MainTest {
    @Test
    public void testReadInput() {

        //given
        String inputString = "3 5\n1 2\n2 3";
        Scanner input = new Scanner(inputString);
        input.useDelimiter("\\s");

        //when
        int[][] expected = {{3, 5}, {1, 2}, {2, 3}};
        int[][] actual = Main.readInput(input, 3);

        //then
        Assertions.assertArrayEquals(expected, actual);
    }
}
