package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int number = input.nextInt();

        System.out.println("number = " + number);
    }
}
