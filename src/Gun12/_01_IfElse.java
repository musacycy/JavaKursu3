package Gun12;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        //yan yana aralarında bir boşlıukla girilen 2 int sayının
        //birbirine eşit olup olmadığını bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 2 Sayı fgiriniz :");
        String number=scan.nextLine();
        int blank=number.indexOf(" ");
        int number1= Integer.parseInt(number.substring(0,blank-1));
        int number2=Integer.parseInt(number.substring(blank+1,number.length()-1));
        if(number1==number2){
            System.out.println("Sayılar eşit");
        }
        else {
            System.out.println("Sayılar eşit değil");
        }


    }
}
