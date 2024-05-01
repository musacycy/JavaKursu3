package Gun26._03_Soru;



import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        ArrayList<Ogrenci> myClass=new ArrayList<>();
        Scanner scan =new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Ogrenci stdnt=new Ogrenci();
            System.out.print("Öğrenci adı giriniz =");
            stdnt.name=scan.next();
            System.out.print("Öğrenci soyadı giriniz =");
            stdnt.surname=scan.next();
            System.out.print("Öğrenci sınıfı giriniz =");
            stdnt.studentClass=scan.next();
            System.out.print("Öğrenci adresi giriniz =");
            stdnt.adress=scan.next();
            myClass.add(stdnt);
        }
        for (Ogrenci ogr:myClass){
            System.out.println("ogr.name = " + ogr.name);
            System.out.println("ogr.surname = " + ogr.surname);
            System.out.println("ogr.studentClass = " + ogr.studentClass);
            System.out.println("ogr.adress = " + ogr.adress);
        }
    }
}

