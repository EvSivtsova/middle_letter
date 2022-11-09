package middle_letter;

public class MiddleLetter {
    public String getLetter(String word) {
        if (word.length() % 2 != 0) {
            int index = word.length() / 2;
            return String.valueOf(word.charAt(index));
        } else {
            int index = word.length() / 2;
            return word.substring(index - 1, index + 1);
        }
    }
}
