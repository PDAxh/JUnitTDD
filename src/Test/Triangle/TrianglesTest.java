package Triangle;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class TrianglesTest {

    Random random = new Random();

    @Before
    public void setUp() throws Exception {
    }



    @Test
    public void triangleHasLeast2sidesEqual() throws Exception {
        // ARRANGE DELEN
        double a = 2;
        double b = 2;
        double c = 2;


        // ACT DEL

        boolean result = Triangles.triangles(a, b, c);


        // ASSERT
        assertTrue(result == true);

    }

    @Test
    public void triangleHasRandomsideLenghts() throws Exception {
        int  a = random.nextInt(10) + 1;
        int  b = a;
        int  c = ((random.nextInt(10) + 1)/2);

        boolean result2 = Triangles.triangles(a, b, c );

        assertTrue(result2 == true);
    }
    @Test
    public void triangleDifferentSideLenghts() throws Exception {
        int  a = -1;
        int  b = 2;
        int  c = 4;

        boolean result3 = Triangles.triangles(a, b, c );

        assertTrue(result3 == true);
    }
    @Test
    public void triangleDifferentSideLenghts2() throws Exception {
        int  a = random.nextInt(10)+1;
        int  b = a;
        int  c = ((random.nextInt(10)+1)/2); // this does not work at all

        System.out.println(a + " " +b+ " "+ c);
        boolean result3 = Triangles.triangles(a, b, c );

        assertTrue(result3 == true);
    }



    @After
    public void tearDown() throws Exception {
    }
}