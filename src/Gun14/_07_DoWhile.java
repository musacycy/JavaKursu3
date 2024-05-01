package Gun14;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        //Kullanıcıdan x girene kadar ekrana program çalışıyor yazan x basılınca bitti yazan
        // TODO: 07.06.2022 14. gün 5/13/2022 3.video sonunda ödevleri çözüyor
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen text girin :");
        String text=scan.next();
        do{
            System.out.println("Program çalışıyor");
            System.out.print("Lütfen text girin :");
            text=scan.next();
        }
        while (!text.equalsIgnoreCase("x"));
            System.out.println("program bitti");

    }
}
