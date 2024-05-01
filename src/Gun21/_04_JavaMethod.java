package Gun21;

import java.util.Scanner;

public class _04_JavaMethod {
    //Kullanıcıdan öğrenci adı ve notlarınız (60 70 90 ... ) şeklinde
    // 3 öğrenci ve 3 ders notu alınız bunların otalamasını
    // bir metotda bulduktan sonra sonucu ekrana ismet 75 şeklinde
    // yazdırınız main içerisinde.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print(i + ".Öğrenci Adı =");
            String name = scan.nextLine();
            System.out.print("Notlar =");
            String notes = scan.nextLine();
            System.out.println("Öğrenci Adı ve Notu = " + name + " " +average(notes));
        }

    }
    public static int average(String notes) {

        String[] notesArray = notes.split(" ");
        int sum = 0;
        for (int i = 0; i < notesArray.length; i++) {
            sum = sum + Integer.parseInt(notesArray[i]);
        }
        return sum / notesArray.length;
    }
}