package Streams;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
  public  void testName(){
        Person person = new Person();
        person.setName("Viraj");
        assertEquals("Viraj" ,person.getName());
        assertTrue(person.getName() instanceof Object);


    }
}
