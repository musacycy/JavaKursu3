package Gun19;

import java.util.Arrays;

public class _02_JavaArray {
    public static void main(String[] args) {
        //100 elemanlı random bir dizi oluşturup
        //tek elemanları başka diziye atayınız

        int[] numbers = new int[10];
        
        
        for (int i = 0; i < 10; i++)
            numbers[i] = (int) (Math.random() * 10);
        int oddcounts=0;
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]%2==1){
                oddcounts++;
            }
        }
        int[] oddNumbers=new int[oddcounts];
        
        int oddIndex=0;
        for (int i = 0; i <numbers.length; i++) {
            if(numbers[i]%2==1){
                oddNumbers[oddIndex]=numbers[i];
                oddIndex++;
            }
        }

        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println("Arrays.toString(oddNumbers) = " + Arrays.toString(oddNumbers));


    }
}
