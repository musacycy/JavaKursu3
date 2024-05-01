package Gun13;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {
        //1 den 10 a kadar ürettik ,5-10 arası desek nasıl yaparız

        Scanner scan = new Scanner(System.in);
        System.out.print("min :");
        int min=scan.nextInt();

        System.out.print("max :");
        int max =scan.nextInt();

        int numberInRange =(int) (Math.random()*((max-min)+1))+min;

        System.out.println("random sayı :"+numberInRange);
    }
}
