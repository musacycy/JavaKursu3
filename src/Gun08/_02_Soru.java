package Gun08;

import java.util.Scanner;
import java.util.SortedMap;

public class _02_Soru {
    public static void main(String[] args) {
        //girilen bir stringin boş olup olmadığını kontrol edin
        Scanner scan =new Scanner(System.in);

        System.out.print("Bir String girin :");
        String text=scan.nextLine();

        System.out.println("Boş mu :"+text.isEmpty());
    }
}
