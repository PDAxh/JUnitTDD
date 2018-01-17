package TDDLessons.Lesson4;

import org.junit.Test;

import static org.junit.Assert.*;

public class LanguageTest {
    @Test
    public void testStringWithManyVowels() {
        String s = "Jakob";
        int result = Language.vowelCount(s);
        assertEquals(2, result);
    }

    @Test
    public void testStringWithOneVowel() {
        String s = "Hi";
        int result = Language.vowelCount(s);
        assertEquals(1, result);
    }

    @Test
    public void testNullString() {
        String s = null;
        int result = Language.vowelCount(s);
        assertEquals(0, result);
    }

    @Test
    public void testEmptyString() {
        String s = "";
        int result = Language.vowelCount(s);
        assertEquals(0, result);
    }
    @Test // to test how many vowels that exist in string
    public void testToChecVowelinString(){
        //List<char[]> list1 = Arrays.asList(new char[]{'a','e','i','o','u'});
        String name = "Daniel is the king" ;
        int count = 0;
        for (int i = 0; i < name.length(); i++)
        {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i'
                    || name.charAt(i) == 'o' || name.charAt(i) == 'u')
            {
                count++;
            }
        }
        assertEquals(6, count);
    }

    @Test
    public void checking4Vowels(){
        String name = "Daniel is the king" ;

    }
}