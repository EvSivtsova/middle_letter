package middle_letter;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleLetterTest {
    @Test
    public void shouldReturnOneLetter_WhenWordLengthIsOdd() {
        String word = "testing";
        String expectedLetter = "t";

        MiddleLetter middleLetter = new MiddleLetter();
        String result = middleLetter.getLetter(word);
        assertEquals("Returns one letter if word's length is odd", expectedLetter, result);
    }

    @Test
    public void shouldReturnOneLetter_WhenWordLengthIsOdd2() {
        String word = "cup";
        String expectedLetter = "u";

        MiddleLetter middleLetter = new MiddleLetter();
        String result = middleLetter.getLetter(word);
        assertEquals("Returns one letter if word's length is odd", expectedLetter, result);
    }

    @Test
    public void shouldReturnOneLetter_WhenWordLengthIsOdd3() {
        String word = "water";
        String expectedLetter = "t";

        MiddleLetter middleLetter = new MiddleLetter();
        String result = middleLetter.getLetter(word);
        assertEquals("Returns one letter if word's length is odd", expectedLetter, result);
    }

    @Test
    public void shouldReturnTwoLetters_WhenWordLengthIsEven() {
        String word = "banana";
        String expectedLetters = "na";

        MiddleLetter middleLetter = new MiddleLetter();
        String result = middleLetter.getLetter(word);
        assertEquals("Returns one letter if word's length is odd", expectedLetters, result);
    }
}