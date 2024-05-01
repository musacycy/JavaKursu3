package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        //girilen vize ve final notunu okuyarak ortalamayı bulunuz
        //ortalama 60 ve üzeri ise geçti yoksa bütünlemeye kaldı yazınız
        Scanner scan =new Scanner(System.in);
        System.out.print("Vize notu giriniz :");
        int vizeN=scan.nextInt();
        System.out.print("Final notunuzu giriniz :");
        int finalN=scan.nextInt();
        double ort=(vizeN*0.4)+(finalN*0.6);
        if(ort>=60) {
            System.out.println("Tebrikler geçtiniz");
        }
        else{
            System.out.println("Bütünlemeye kaldınız ");
        }
    }
}
