package day03_EscapeSequences;

import java.util.Arrays;

public class AboutMe {
    public static void main(String[] args) {
        for (String s : Arrays.asList("Favorite music: \"classic\",\"jazz\"", "Favorite book: Atomic habit", "Favorite quote: Time is value", "Favorite TV show: Dragons's Den")) {
            System.out.println(s);
        }
    }
}
