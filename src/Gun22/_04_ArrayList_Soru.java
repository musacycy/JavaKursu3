package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_ArrayList_Soru {
    public static void main(String[] args) {
        //kullanıcıdan alacağınız 6 elemanlı bir diziyi
        //sadece tek elemanlarını başka bir diziye atıp yazdırınız

        Scanner scan=new Scanner(System.in);
        int[] arrays =new int[6];
        for (int i = 0; i <arrays.length ; i++) {
            System.out.print("Sayı giriniz  = ");
            arrays[i]=scan.nextInt();
        }
        ArrayList<Integer> rtnOddNumbers=oddNumbersFunc(arrays);
        System.out.println("oddNumbers = " + rtnOddNumbers);
        //TODO:metod yardımıyla tek elemanları mainde yazdırınız
    }

    public  static ArrayList<Integer>  oddNumbersFunc(int[] arrays){
        ArrayList<Integer> oddNumbers= new ArrayList<>();
        for (int i = 0; i < arrays.length ; i++) {
            if (arrays[i]%2==1){
                oddNumbers.add(arrays[i] );
            }
        }
        return oddNumbers;
    }
}
