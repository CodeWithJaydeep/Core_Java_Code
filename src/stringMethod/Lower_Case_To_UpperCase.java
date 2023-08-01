package stringMethod;

import java.util.Locale;

public class Lower_Case_To_UpperCase {
    public static void main(String[] args) {
        String name="code with jaydeep";
        String cString=name.toUpperCase(Locale.ROOT);
        System.out.println(cString);

        String lString=name.toLowerCase(Locale.ROOT);
        System.out.println(lString);

        String name1="ANOOP KUMAR";
        String lowerString=name1.toLowerCase(Locale.ROOT);
        System.out.println(lowerString);

    }
}
