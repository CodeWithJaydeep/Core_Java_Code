package Scanner;

import java.util.Scanner;

public class Calculator_User {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter value for add");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add=a+b;
        System.out.println(add);

        System.out.println("Please enter value for multi");
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int c1=a1*a2;
        System.out.println(c1);


    }
}
