package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {

        tekmiCiftmi(34);
        tekmiCiftmiNew();
    }
    public static void tekmiCiftmi(int number){
        if(number%2==1){
            System.out.println("tek");
        }
        else System.out.println("çift");
    }
    public static void tekmiCiftmiNew(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz :");
        int number=scan.nextInt();
        if(number%2==1){
            System.out.println("tek");
        }
        else System.out.println("çift");
    }
}
