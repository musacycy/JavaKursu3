package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Lütfen adınızı giriniz :");

        String name =input.next();
        System.out.print("Lütfen soyadınızı giriniz :");
        String surname=input.next();
        System.out.print("Lütfen yaşınızı giriniz :");
        int age=input.nextInt();
        System.out.println("Hoş geldiniz " +name+" "+surname+" yaşınız :"+age);
    }
}
