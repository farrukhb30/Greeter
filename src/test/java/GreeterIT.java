import com.google.common.base.CharMatcher;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

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
        String actual = CharMatcher.whitespace().trimFrom(Greeter.greet("     Tahar"));
        assertEquals(expected, actual);
    }

    @Test
    void testCapitalizeFirstWord(){
        Greeter greet = new Greeter();
        String expected = "Hello Tahar";
        String actual = greet.greet(StringUtils.capitalize("tahar"));
        assertEquals(expected, actual);
    }

}