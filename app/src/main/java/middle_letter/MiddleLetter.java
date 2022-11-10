package middle_letter;

public class MiddleLetter {
    public String getLetter(String word) {
        int index = word.length() / 2;
        if (word.length() % 2 != 0) {
            return String.valueOf(word.charAt(index));
        } else {
            return word.substring(index - 1, index + 1);
        }
    }
}