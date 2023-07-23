package Practice;

import java.util.Scanner;

public class Chapter1 {

    //1.How to add 3 numbers with variable
    public static void main(String[] args) {

        int a=20;
        int b=30;
        int c=40;
        int sum=a+b+c;
        System.out.println(sum);
    //2. Percentage

        float subject1 =50;
        float subject2 =60;
        float subject3 =90;
        float cgpa = (subject1+subject2+subject3)/30;
        System.out.println(cgpa);

        Scanner sc =new Scanner(System.in);
        String name=sc.next();
        System.out.println("Hello "+ name + " Have a good day");


    }
}
