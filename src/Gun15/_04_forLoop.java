package Gun15;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
        // kullanıcının gireceği bir rakama kadar olan sayıların toplamını bulun

        Scanner scan= new Scanner(System.in);
        System.out.print("Rakam giriniz :");
        int number=scan.nextInt();
        int sum=0;
        for (int i=0;i<=number;i++){
            sum=sum+i;
        }
        System.out.println("toplam :"+sum);

    }
}
