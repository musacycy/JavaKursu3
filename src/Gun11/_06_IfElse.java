package Gun11;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        //girilen bir stringin uzunluğu 10 dan büyükse ve
        // string içinde *study* kelimesi geçiyorsa ekrana eve değilse hayr
        //büyük küçük harf ayrımı yapmadan

        Scanner scan =new Scanner(System.in);
        System.out.print("Bir cümle giriniz :");
        String text = scan.nextLine();
        int textLong=text.length();
        if(textLong>10 && text.toLowerCase().contains("study"))
        {
            System.out.println("evet");
        }
        else {
            System.out.println("hayır");
        }
    }
}
