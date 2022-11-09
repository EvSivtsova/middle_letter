package middle_letter;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class MiddleLetterTest {
    MiddleLetter middleLetter;
    @Before
    public void initialize() {
         middleLetter = new MiddleLetter();
    }
    @Test
    public void shouldReturnOneLetter_WhenWordLengthIsOdd() {
        String word = "testing";
        String expectedLetter = "t";

        String result = middleLetter.getLetter(word);
        assertEquals("Returns one letter if word's length is odd", expectedLetter, result);
    }

    @Test
    public void shouldReturnOneLetter_WhenWordLengthIsOdd2() {
        String word = "cup";
        String expectedLetter = "u";

        String result = middleLetter.getLetter(word);
        assertEquals("Returns one letter if word's length is odd", expectedLetter, result);
    }

    @Test
    public void shouldReturnOneLetter_WhenWordLengthIsOdd3() {
        String word = "water";
        String expectedLetter = "t";

        String result = middleLetter.getLetter(word);
        assertEquals("Returns one letter if word's length is odd", expectedLetter, result);
    }

    @Test
    public void shouldReturnTwoLetters_WhenWordLengthIsEven() {
        String word = "banana";
        String expectedLetters = "na";

        String result = middleLetter.getLetter(word);
        assertEquals("Returns two letters if word's length is even", expectedLetters, result);
    }

    @Test
    public void shouldReturnTwoLetters_WhenWordLengthIsEven2() {
        String word = "lama";
        String expectedLetters = "am";

        String result = middleLetter.getLetter(word);
        assertEquals("Returns two letters if word's length is even", expectedLetters, result);
    }

    @Test
    public void shouldReturnTwoLetters_WhenWordLengthIsEven3() {
        String word = "flower";
        String expectedLetters = "ow";

        String result = middleLetter.getLetter(word);
        assertEquals("Returns two letters if word's length is even", expectedLetters, result);
    }

    @Test
    public void shouldReturnOneLetter_WhenWordIsOneLetterLong() {
        String word = "A";
        String expectedLetters = "A";

        String result = middleLetter.getLetter(word);
        assertEquals("Returns one letters if the word is one letter long", expectedLetters, result);
    }

    @Test
    public void shouldReturnOneLetter_WhenWordIsOneLetterLong2() {
        String word = "a";
        String expectedLetters = "a";

        String result = middleLetter.getLetter(word);
        assertEquals("Returns one letter if the word is one letter long", expectedLetters, result);
    }

    @Test
    public void shouldReturnTwoLetters_WhenWordIsTwoLettersLong() {
        String word = "an";
        String expectedLetters = "an";
        
        String result = middleLetter.getLetter(word);
        assertEquals("Returns two letters if the word is two letters lonq", expectedLetters, result);
    }
}