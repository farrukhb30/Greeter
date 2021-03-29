import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {

    @Test
    void testGreet(){
        Greeter greet = new Greeter();
        String expected = "Tahar";
        assertEquals(expected, greet.greet("Tahar"));
    }

}