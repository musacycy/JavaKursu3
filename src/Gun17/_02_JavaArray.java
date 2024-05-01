package Gun17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        int number;// 1 tane yer açar

        int[] array1 = new int[5];// 0,1,2,3,4 indexli 5 adet yer açar hafızada

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < array1.length; i++) {
            System.out.print("sayı giirniz :");
            array1[i] = scan.nextInt();
        }
        System.out.println("array[4] :" + array1[4]);
    }
}