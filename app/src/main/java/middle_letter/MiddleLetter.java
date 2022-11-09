package middle_letter;

public class MiddleLetter {
    public Character getLetter(String word) {
        int index = word.length() / 2;
        return word.charAt(index);
    }
}
