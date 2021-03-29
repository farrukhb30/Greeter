import com.google.common.base.CharMatcher;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;


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
        String expected = "Tahar";
        String actual = greet.greet(StringUtils.capitalize("tahar"));
        assertEquals(expected, actual);
    }
    @Test
    void testFGoodMorning(){
        Greeter greet = new Greeter();
        String expected = "Good morning Tahar";
        String actual = greet.greet(StringUtils.capitalize("tahar"));
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



    @Test
    void testCapitalizeFirst(){
        Greeter greet = new Greeter();
        String expected = "Good evening Tahar";

        if (LocalDateTime.now().getHour() == 21);
            String actual = "Good evening " + greet.greet("Tahar");
       assertEquals(expected, actual);
    }
}