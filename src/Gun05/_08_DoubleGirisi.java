package Gun05;

import java.util.Scanner;

public class _08_DoubleGirisi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen double giriniz :");
        //input.useLocale() ülkelere göre "," veya "." kulananın tercihine göre
        double value=input.nextDouble();
        System.out.println("value = " + value);
    }
}
