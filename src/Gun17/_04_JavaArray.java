package Gun17;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        //5 5 elemanılı bir int dizisi tanımlayınız
        //ortalamadan büyük elemanı yazdırınız
        Scanner scan=new Scanner(System.in);
        int[] notes=new int[5];
        int sum=0;
        int i=0;
        for (i = 0; i <5 ; i++) {
            System.out.print("Not giriniz :");
            notes[i]=scan.nextInt();
            sum =sum+notes[i];


        }
        double average=sum/(i+1);
        System.out.println("ortalama :"+average);
        for(int j=0;j<5;j++){
            if(notes[j]>average){
                System.out.println("ortalamayı geçen :"+notes[j]);
            }

        }


    }
}
