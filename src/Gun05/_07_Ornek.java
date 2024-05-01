package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        //kullanıcıdan ağırlığını ve boyunu double olarak alınız
        // ve bir satırda boyunuz... kilonuz...
        // vücut kitle indeksiniz kg/boy*boy yazınız
        Scanner input =new Scanner(System.in);

        System.out.print("Lütfen Kilonuzu giriniz :");
        double weight = input.nextDouble();
        System.out.print("Lütfen boyunuzu giriniz :");
        double height = input.nextDouble();
        int index=(int)(weight/(height*height));
        System.out.println("Kilonuz : " +weight+" Boyunuz :"+height+" kitle endeksiniz :"+index);
    }
}
