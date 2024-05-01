package Gun18;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        //kullanıcıdan girdiği bir cümlede kaç kelime olduğunu bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.print("Bir cümle giriniz :");
        String text=scan.nextLine();
        int count=0;
        for (int i = 0; i <text.length() ; i++) {
            if(text.charAt(i)==' '){
                count++;
            }
        }
        System.out.println("count = " + (count+1));
    }
}
