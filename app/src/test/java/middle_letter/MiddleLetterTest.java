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
        assertEquals("Returns two letters if word's length is even", expectedLetters, result);
    }

    @Test
    public void shouldReturnTwoLetters_WhenWordLengthIsEven2() {
        String word = "lama";
        String expectedLetters = "am";

        MiddleLetter middleLetter = new MiddleLetter();
        String result = middleLetter.getLetter(word);
        assertEquals("Returns two letters if word's length is even", expectedLetters, result);
    }

    @Test
    public void shouldReturnTwoLetters_WhenWordLengthIsEven3() {
        String word = "flower";
        String expectedLetters = "ow";

        MiddleLetter middleLetter = new MiddleLetter();
        String result = middleLetter.getLetter(word);
        assertEquals("Returns two letters if word's length is even", expectedLetters, result);
    }

    @Test
    public void shouldReturnOneLetter_WhenWordIsOneLetterLong() {
        String word = "A";
        String expectedLetters = "A";

        MiddleLetter middleLetter = new MiddleLetter();
        String result = middleLetter.getLetter(word);
        assertEquals("Returns two letters if word's length is even", expectedLetters, result);
    }

    @Test
    public void shouldReturnOneLetter_WhenWordIsOneLetterLong2() {
        String word = "a";
        String expectedLetters = "a";

        MiddleLetter middleLetter = new MiddleLetter();
        String result = middleLetter.getLetter(word);
        assertEquals("Returns two letters if word's length is even", expectedLetters, result);
    }


    @Test
    public void shouldReturnTwoLetters_WhenWordIsTwoLetterLong() {
        String word = "an";
        String expectedLetters = "an";

        MiddleLetter middleLetter = new MiddleLetter();
        String result = middleLetter.getLetter(word);
        assertEquals("Returns two letters if word's length is even", expectedLetters, result);
    }
}