package Gun23;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _01_Java2DArrayList {
    public static void main(String[] args) {
        int sayi=5;// tek bir rakam saklayabilen değişken
        int[] dizi =new int[20];// 20 adet sayı saklayabilen değişken
        int[][] tablo=new int[20][4];//20x4 tane sayı saklayabilen değişken
        ArrayList<Integer> liste=new ArrayList<>();//istenildiği kadar rakam eklenebilen değişken
        /****************************************/
        //3 öğrencinin mat fiz kim notlarını tek bir yerde birleştireceği
        ArrayList<ArrayList<Integer>> notList=new ArrayList<>();//Listelerinlistesi
        //bunun her elemanı arraylist

        ArrayList<Integer> matNotes=new ArrayList<>();
        matNotes.add(60);
        matNotes.add(70);
        matNotes.add(80);
        matNotes.add(90);

        ArrayList<Integer> fizNotes=new ArrayList<>();
        fizNotes.add(65);
        fizNotes.add(75);
        fizNotes.add(85);

        ArrayList<Integer> kimNotes=new ArrayList<>();
        kimNotes.add(85);
        kimNotes.add(95);
        kimNotes.add(55);

        notList.add(matNotes);
        notList.add(fizNotes);
        notList.add(kimNotes);

        notList.get(0);//0 indeksli listeyi verir
        notList.get(0).get(0);//0 indeksli listenin 0 indeksli elemanı
        System.out.println("notlist = " + notList.get(0));
        System.out.println("notlist = " + notList.get(1));
        System.out.println("notlist = " + notList.get(2));

        for (int i = 0; i < notList.size(); i++) {
            System.out.println("notList.get(i) = " + notList.get(i));
        }
        ArrayList<String> lessons=new ArrayList<>();
        lessons.add("Matematik");
        lessons.add("Fizik");
        lessons.add("Kimya");

        // tüm notları yazdırmak için

        for (int i = 0; i < notList.size(); i++) {
            System.out.println(lessons.get(i));
            for (int j = 0; j < notList.get(i).size(); j++) {
                System.out.print((i+1)+".yaprak " + (j+1)+".not =");
                System.out.println(notList.get(i).get(j));
            }
        }


        Scanner scan=new Scanner(System.in);
        System.out.print("0-Mat, 1-Fizik, 2-Kimya = ");
        int number=scan.nextInt();
        printLessonNote(notList,number,lessons);
        double rtnAvg=avgPrint(notList,number);
        System.out.println("rtnAvg = " + rtnAvg);
        ArrayList<Double> rtnAvgAll=avgAllPrint(notList);

        for (int i = 0; i < notList.size(); i++) {
            System.out.println(lessons.get(i));
            System.out.println(rtnAvgAll.get(i));
        }

        for (int i = 0; i < notList.size(); i++) {
            System.out.println(lessons.get(i));
            Collections.sort(notList.get(i));
            System.out.println(notList.get(i).get(0));
            System.out.println(notList.get(i).get(notList.get(i).size()-1));
        }
        
    }

    public static void  printLessonNote(ArrayList<ArrayList<Integer>> notList,int number,ArrayList<String> lessons){
        System.out.println(lessons.get(number));
        for (int i = 0; i < notList.size(); i++) {
            System.out.println(notList.get(number).get(i));
        }
    }
    //yukarıda girilen derse ait ortalamayı bulun
    public static double avgPrint(ArrayList<ArrayList<Integer>> notList,int number){
        int sum =0;
        for (int i = 0; i < notList.get(number).size(); i++) {
            sum+=notList.get(number).get(i);
        }
        double avg=sum/notList.get(number).size();
        return avg;
    }
    // tüm notların ortalamasını bir fonksiyonda bulup mainde yazdırın
    public static ArrayList<Double> avgAllPrint(ArrayList<ArrayList<Integer>> notList){
        int sum =0;
        double avg=0;
        ArrayList<Double> avgAll=new ArrayList<>();
        for (int i = 0; i < notList.size(); i++) {
            for (int j = 0; j < notList.get(i).size(); j++) {
                sum+=notList.get(i).get(j);
            }
            avg=(sum/notList.get(i).size());
            avgAll.add(avg);
            sum=0;
            avg=0;
        }
        return avgAll;
    }

}
