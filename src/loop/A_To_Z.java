package loop;

import java.util.Locale;

public class A_To_Z {

    public static void main(String[] args) {
        //Printing A to Z
        char ch;
        for(ch = 'A'; ch <= 'Z'; ++ch) {
            System.out.print(ch+" ");

           // Convert to lower case
            char lch = Character.toLowerCase(ch);

            System.out.println(lch);

        }

        }
    }

