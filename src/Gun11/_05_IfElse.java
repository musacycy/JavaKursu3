package Gun11;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        //girilen bir stringin uzunluğu 10 dan büyükse ve
        // string içinde *study* kelimesi geçiyorsa ekrana eve değilse hayr

        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen bir cümle girin :");
        String text =scan.nextLine();

        int longText=text.length();
        if(longText>10 && text.contains("study")){
            System.out.println("evet");
        }
        else{
            System.out.println("hayır");
        }
    }
}
