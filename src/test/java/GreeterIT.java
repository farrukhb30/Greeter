import com.google.common.base.CharMatcher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreeterIT {

    @Test
    void testGreet(){
        Greeter greet = new Greeter();
        String expected = "Tahar";
        assertEquals(expected, greet.greet("Tahar"));
    }

    @Test
    void testGreetTrim(){
        Greeter greet = new Greeter();
        String expected = "Tahar";
        String actual = CharMatcher.whitespace().trimFrom("     Tahar");
        assertEquals(expected, actual);
    }

    @Test
    void testGreetGustav(){
        Greeter greet = new Greeter();
        String expected = "TJENARE";
        String name = "TJENARE, Farrukhs dator fryser!";
        String actual = name.substring(0,7);
        assertEquals(expected, actual);
    }


}