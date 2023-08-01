package Practice;

import java.util.Locale;

public class String_Method {
    public static void main(String[] args) {

        //problem 1  all char convert to lower case
        String name="Code With Jaydeep";
        name=name.toLowerCase(Locale.ROOT);
        System.out.println(name);

        //problem 2 Replace to Space as a UnderScor(_)
        String text= "To Lower case";
        text=text.replace(" ","_");
        System.out.println(text);

        //Problem
        String letter="Dear <|name|> , Thanks alot";
        letter=letter.replace("<|name|>","Jaydeep");
        System.out.println(letter);




    }
}
