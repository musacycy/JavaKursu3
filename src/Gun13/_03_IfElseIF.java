package Gun13;

import java.util.Locale;
import java.util.Scanner;

public class _03_IfElseIF {
    public static void main(String[] args) {
        //kullanıcıdan Fizik:90 not bilgisi alınız
        Scanner scan=new Scanner(System.in);
        System.out.print("notu giriniz :");
        String note= scan.nextLine();
        int nNote=Integer.parseInt(note.replaceAll("[^0-9]",""));
       // int nNote=Integer.parseInt(note.toUpperCase(Locale.ROOT).replaceAll("[A-Z]","").replaceAll(":","").replaceAll(" ",""));
        if (nNote>=90){
            System.out.println("harf notu A");
        } else if (nNote>=80) {
            System.out.println("harf notu B");

        }
        else if (nNote>=70) {
            System.out.println("harf notu C");

        }
        else if (nNote>=60) {
            System.out.println("harf notu D");

        }
        else if (nNote>=40) {
            System.out.println("harf notu E");

        }
        else if (nNote<40) {
            System.out.println("harf notu F");

        }
    }
}
