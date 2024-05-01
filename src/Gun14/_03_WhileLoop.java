package Gun14;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        //girilen 20 sayının toplamının sonucunu yazdırınız

        Scanner scan=new Scanner(System.in);
        int sum=0;
        int count=0;
        while (count<20){
            System.out.print("Lütfen sayı giriniz :");
            int number=scan.nextInt();
            sum=number+sum;
            count++;
        }
        System.out.print("toplam :"+sum);
    }
}
