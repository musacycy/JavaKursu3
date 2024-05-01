package Gun18;

import java.util.Random;

public class _01_JavaArray {
    public static void main(String[] args) {
        //50 elemanlı bir dizi tanımlayınız 10 a kadar olan sayılardan random atayarak
        //doldurunuz sonrasında tek olanlara 1 çift olanlara 2 atayınız

        int[] numbers=new int[50];
        Random rand=new Random();
        int tek=0;
        int cift=0;
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]= (int)(Math.random()*10);
            System.out.println(i+".sayı :"+numbers[i]);
        }

        for (int i = 0; i <50 ; i++) {
            if(numbers[i]%2==1)
            {
                numbers[i]=1;
                tek++;

            } else if (numbers[i]%2==0) {
                numbers[i]=2;
                cift++;
            }
        }
        System.out.println("tek sayısı :"+tek+"çift sayısı :"+cift);
    }
}
