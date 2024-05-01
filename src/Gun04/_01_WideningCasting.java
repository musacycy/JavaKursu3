package Gun04;

public class _01_WideningCasting {
    public static void main(String[] args) {
         // byte -> short -> char -> int ->long -> float -> double otomatik dönüşüm

        int sayi=9;
        long toplam;
        double oran=3.14;
         oran =sayi; // oran=9 kayıp olmadan
        //genişletilme yönünde olduğu için Widening Casting diyoruz

        System.out.println("oran = " + oran);
        
        toplam = sayi;
        System.out.println("toplam = " + toplam);

    }
}
