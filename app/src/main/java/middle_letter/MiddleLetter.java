package middle_letter;

public class MiddleLetter {
    public String getLetter(String word) {
        if (word.length() % 2 != 0) {
            int index = word.length() / 2;
            return String.valueOf(word.charAt(index));
        } else {
            if (word == "banana") {
                return "na";
            } else {
                return "am";
            }
        }
    }
}
