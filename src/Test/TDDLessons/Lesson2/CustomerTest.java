package TDDLessons.Lesson2;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void setNameOnlyLowerCase() {
        Customer customer= new Customer();
        customer.setName("daniel");
        String result = customer.getName();
        assertEquals("daniel", result);
    }

    @Test
    public void setAge() {
        Customer customer = new Customer();
        customer.setAge(32);
        int result = customer.getAge();
        assertEquals(32, result);
    }

    @Test
    public void setSsn() {
    }
}