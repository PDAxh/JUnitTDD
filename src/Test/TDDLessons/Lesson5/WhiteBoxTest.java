package TDDLessons.Lesson5;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class WhiteBoxTest {

    Random random = new Random();
    @Test
    public void russianMultiplication() {
        int x = random.nextInt();
        int y = 1;
        int result = 0;
        if(x % 2 != 0){
            result = result + y;
        }
        assertEquals(result, 0);
    }
}