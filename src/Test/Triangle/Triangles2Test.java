package Triangle;

import TDDLessons.Lesson1.Triangles2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Triangles2Test {

    @Before
    public void setUp() throws Exception {
    }


    @Test
    public void triangles() throws Exception {

        int  a = -2;
        int  b = 2;
        int  c = 4;

        boolean result = Triangles2.triangles2(a, b, c );

        assertTrue(result == false);
    }

    @Test
    public void triangleWithDifferentLenghts(){
        int  a = -2;
        int  b = 0;
        int  c = 2;

        boolean result2 = Triangles2.triangles2(a, b, c );

        assertTrue(result2 == false);
    }


    @After
    public void tearDown() throws Exception {
    }
}