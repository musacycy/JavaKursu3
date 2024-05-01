package Gun06;

import java.util.Scanner;

public class _12_Soru {
    public static void main(String[] args) {
        // girilen bir stringde boşluk olup olmadığını bulunuz

        Scanner input=new Scanner(System.in);
        System.out.print("Bir String giriniz :");
        String s1=input.nextLine();

        System.out.println("Bosluk var mı? :"+s1.contains(" "));
    }
}
