package Gun17;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        //kaç tanesi tek ve ortalamanın üstünde

        int[] numbers=new int[7];
        Scanner scan =new Scanner(System.in);
        int sum=0;
        int i=0;
        int count=0;
        for (i = 0; i <7 ; i++) {
            System.out.print((i+1)+".Sayıyı giriniz :");
            numbers[i]=scan.nextInt();
            sum=sum+numbers[i];
        }
        double average=sum/(i+1);

        for (int j = 0; j<7 ; j++) {
            if(numbers[j]>average && numbers[j]%2==1){
                System.out.println("ortalamayı geçen ve tek :"+numbers[j]);
                count++;
            }

        }
        System.out.println("adet :"+count);

    }
}
