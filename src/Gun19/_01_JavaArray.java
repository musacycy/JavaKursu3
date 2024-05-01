package Gun19;

import java.util.Arrays;

public class _01_JavaArray {
    public static void main(String[] args) {
        //100 elemanlı random bir dizi oluşturup
        //tek elemanları başka diziye atayınız

        int[] numbers = new int[10];
        int[] newNumbers = new int[10];
        int i = 0;
        for (i = 0; i < 10; i++)
            numbers[i] = (int) (Math.random() * 10);
        int tekindex = 0;

        for (i = 0; i < 10; i++) {
                if (numbers[i] % 2 == 1) {
                    newNumbers[tekindex] = numbers[i];
                    tekindex++;
                }
        }
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println("Arrays.toString(new) = " + Arrays.toString(newNumbers));
    }
}
