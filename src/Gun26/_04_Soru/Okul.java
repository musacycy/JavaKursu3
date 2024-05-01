package Gun26._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        //Öğretmen için not defteri yapılmak isteniyor
        // her öğrencinin okulNo(int),tamAd(String),notu(int) vardır
        //öğretmenden 20 öğrenci için bu bilgileri alınız
        //bütün sınıfı bir metodda yazdırınız
        //sınıfın not ortalamasını bir metodda yadır
        //gerekli classlar için ayrı bir dosya açınız
        Scanner sc=new Scanner(System.in);
        Functions rtnAvg=new Functions();
        ArrayList<Ogrenci> stdntList=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Ogrenci stdnt=new Ogrenci();
            System.out.print("Öğrenci adı soyadı giriniz =");
            stdnt.nameSurname=sc.nextLine();
            System.out.print("Öğrenci okul no giriniz =");
            stdnt.schoolNo=sc.nextInt();
            System.out.print("Öğrenci notu giriniz =");
            stdnt.note=sc.nextInt();
            stdntList.add(stdnt);
        }


    }


}
