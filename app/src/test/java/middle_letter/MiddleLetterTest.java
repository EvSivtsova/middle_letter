package middle_letter;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleLetterTest {
    @Test
    public void shouldReturnOneLetter_WhenWordLengthIsOdd() {
        String word = "testing";
        char expectedLetter = 't';

        MiddleLetter middleLetter = new MiddleLetter();
        char result = middleLetter.getLetter(word);
        assertEquals("Returns one letter if word's length is odd", expectedLetter, result);
    }

    @Test
    public void shouldReturnOneLetter_WhenWordLengthIsOdd2() {
        String word = "cup";
        char expectedLetter = 'u';

        MiddleLetter middleLetter = new MiddleLetter();
        char result = middleLetter.getLetter(word);
        assertEquals("Returns one letter if word's length is odd", expectedLetter, result);
    }
}
