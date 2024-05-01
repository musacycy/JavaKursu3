package Gun05;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {
        //kullanıcının kulanıcı adı ve şifresini isteyiniz

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz :");
        String userName= input.nextLine();

        System.out.print("Şifrenizi giriniz :");

        String password=input.nextLine();

        System.out.println("Giriş başarılı");


    }
}
