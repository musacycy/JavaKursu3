package Gun20;

import java.util.Arrays;
import java.util.Scanner;

public class _05_JavaMethod {
    public static void main(String[] args) {
        //Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra
        //dizinin en küçük,en büyük ve ortalamasını bulduktan sonra
        //bu dizinin bütün elemanlarının karelerini yeni bir diziye atınız
        //bu dizininde en büyük ve en küçük ve ortalamasını bulunuz

     Scanner scan = new Scanner(System.in);
        int[] number=new int[5];
        for (int i = 0; i < 4; i++) {
            System.out.print(i+". elemanı girin :");
            number[i]=scan.nextInt();
        }
        minValuePrint(number);
        maxValuePrint(number);
        avgValuePrint(number);
        int[] number1=new int[5];
        for (int i=0;i<number1.length;i++){
            number1[i]=number[i]*number[i];
        }
        minValuePrint(number1);
        maxValuePrint(number1);
        avgValuePrint(number1);

    }
    public static void minValuePrint(int[] number){
        Arrays.sort(number);
        System.out.println("en küçük ="+number[0]);
    }
    public static void maxValuePrint(int[] number){
        Arrays.sort(number);
        System.out.println("en büyük ="+number[number.length-1]);
    }
    public static void avgValuePrint(int[] number){
        int sum=0;
        for (int i=0;i<number.length;i++){
            sum+=number[i];
        }
        double avg =sum/number.length;
        System.out.println("ortalama ="+avg);
    }

}
