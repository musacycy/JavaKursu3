package Gun21;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
    //kullanıcıdan iki sayı girmesini isteyip büyük olanı yazdıran program metod ile
        Scanner scan =new Scanner(System.in);
        System.out.print("1.Sayı giriniz = ");
        int number1= scan.nextInt();
        System.out.print("2.Sayıyı giriniz = ");
        int number2=scan.nextInt();
        
        int maxNumber=maxFind(number1,number2);
        System.out.println("maxNumber = " + maxNumber);
        //_01_JavaMethod.enbBul(number1,number2); aynı paketin içinden fonksiyon çağırma
        //Gun20._01_JavaMethod.enbBul(number1,number2); diğer paketin içinden fonksiyon çağırma
    }
    
    public static int maxFind(int number1,int number2){
       int maxNUmber=number1;
        if(number2>number1){
            maxNUmber=number2;
        }
        return maxNUmber;
        
    }
}
