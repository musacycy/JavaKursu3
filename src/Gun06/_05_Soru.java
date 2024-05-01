package Gun06;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        //girilen bir ad soyadın "Musa Cici" M.C. şeklinde yazdırınız

        Scanner input =new Scanner(System.in);
        System.out.print("Ad Soyad giriniz :");
        String nameSurname= input.nextLine();
        int bosluk = nameSurname.indexOf(" ");
        System.out.println(nameSurname.charAt(0)+"."+nameSurname.charAt(bosluk+1)+".");

    }
}
