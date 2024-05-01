package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_ArrayList_Soru {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        Scanner scan =new Scanner(System.in);
        ArrayList<Integer> noteList=new ArrayList<>();
        int sum =0;
        String choice="";
        do {
            System.out.print("Not giriniz = ");
            int stdNot=scan.nextInt();
            noteList.add(stdNot);
            sum+=stdNot;
            int avg=sum/noteList.size();
            System.out.print("Devam etmek istiyor musunuz (E/H)? = ");
            choice=scan.next();
            passCount(noteList,avg);
        }
        while (choice.equalsIgnoreCase("E"));
    }
    public static void passCount(ArrayList<Integer> noteList,int avg){
        int count=0;
        for (int i = 0; i < noteList.size(); i++) {
            if(noteList.get(i)>avg){
                count+=1;
            }
        }
        System.out.println("geçen sayısı  = " +count );
    }
}
