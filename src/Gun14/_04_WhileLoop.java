package Gun14;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        //girilen bir sayıya kadar olaan sayıların toplamını bularak yazdırınız
        //girilen sayı dahil
        int sum =0;
        Scanner scan =new Scanner(System.in);

        int number=scan.nextInt();
        int count=0;
        while (count<=number){

            sum=sum+count;
            System.out.println("toplam :"+sum);
            count++;
        }
    }
}
