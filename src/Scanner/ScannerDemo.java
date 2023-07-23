package Scanner;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String str=sc.nextLine();
        System.out.println("Please enter your age");
        int a = sc.nextInt();
        System.out.println("Pleae enter your mobile number");
        long mob= sc.nextLong();
        System.out.println("Please enter your adhar number");
        long ad= sc.nextLong();
        System.out.println("Please enter your Account number");
        long ac= sc.nextLong();
        System.out.println("Please enter your post office pin");
        int p=sc.nextInt();


    }
}
