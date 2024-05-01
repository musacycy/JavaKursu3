package Gun07;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        //girilen bir ad soyadın adını ve soyadını ayırıp ayrı ayrı yazın
        Scanner scan=new Scanner(System.in);
        System.out.print("Ad soyad giriniz :");
        String nameSurname= scan.nextLine();
        int index = nameSurname.indexOf(" ");
        System.out.println("index = " + index);
        String piece1=nameSurname.substring(0,index);
        String piece2=nameSurname.substring(index+1);

        System.out.println("1.bölüm :"+piece1);
        System.out.println("2.bölüm :"+piece2);
    }
}
