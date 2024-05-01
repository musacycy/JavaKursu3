package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _05_JavaSplitMetodu {
    public static void main(String[] args) {
        //split bir stringi parçalara ayırmak demek

        Scanner scan =new Scanner(System.in);

        System.out.print("Lütfen bir cümle giriniz :");
        String text=scan.nextLine();
        String[] words = text.split(" ");
        System.out.println("Arrays.toString(words) = " + Arrays.toString(words));
        System.out.println("words.length = " + words.length);
        for (int i = 0; i < words.length; i++) {

            System.out.println("words[i] = " + words[i]);
            
        }
    }
}
