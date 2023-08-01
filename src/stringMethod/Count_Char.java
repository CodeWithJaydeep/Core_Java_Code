package stringMethod;

import java.util.Locale;

public class Count_Char {
    public static void main(String[] args) {

        String name="Jaydeep";
        int value=name.length();
        System.out.println(value);
        String  city=("Agra"+"pune");
        int AllCity=city.length();
        System.out.println(AllCity);

        //System.out.print(name.charAt(2));
        //System.out.print(name.charAt(3));
        //System.out.print(name.charAt(4));
        String Char="Zafar imam";
        System.out.println(Char.lastIndexOf("mam",1));



        String lString = name.toLowerCase(Locale.ROOT);
        System.out.println(lString);
    }
}
