package Gun13;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz :");
        int number1=scan.nextInt();
        System.out.print("2.Sayıyı giriniz :");
        int number2=scan.nextInt();
        System.out.print("Toplam için T\nÇıkarma için Ç\nÇaprma için P\nBölme işlemi için B ye\n basınız:");
        String operator=scan.next();
        switch (operator.toUpperCase()){
            case "T" :System.out.println("toplam ="+(number1+number2));break;
            case "Ç" :System.out.println("çıkarma ="+(number1-number2));break;
            case "P" :System.out.println("çarpma ="+(number1*number2));break;
            case "B" :System.out.println("bölme ="+(number1/number2));break;
            default:
                System.out.println("hatalı giriş");break;
        }
    }
}
