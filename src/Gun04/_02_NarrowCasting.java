package Gun04;

public class _02_NarrowCasting {
    public static void main(String[] args) {
        double oran = 3.2;
        int sayi = 5;

        sayi = (int)oran; // double tipindeki değeri int değerine atıldı
                        // bu tip dönüştürmeler daraltma yönünde olduğundan Narrow casting denir
                        //diğer adıyla manuel dönüşüm denir

        System.out.println("sayi = " + sayi);

    }
}
