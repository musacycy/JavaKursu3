package Gun05;

import java.util.Scanner;

public class _10_Ornek {
    public static void main(String[] args) {
        // kullanıcının kaç bilet (byte) istediğini sigorta isteyip istemediğini(boolean) yazdırınız

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bilet sayısı giriniz :");
        byte pieces= input.nextByte();
        System.out.print("Sigorta ister misiniz? :");
        boolean isInsurance= input.nextBoolean();

        System.out.println("Bilet adedi = "+pieces+" Sigorta "+isInsurance);
    }
}
