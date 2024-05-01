package Gun07;

public class _01_StringSubstring {
    public static void main(String[] args) {
            //stringin belirli bölümünü alma işlemidir

        String s1 = "Merhaba arkadaşlar";

        String piece1=s1.substring(2,6);// 2 nolu indeksten 6 ya kadar al 6 dahil değil
        System.out.println("piece1 = " + piece1);
        System.out.println("2.bolum = " + s1.substring(8,18));
        System.out.println("3.bolum arkadaşlar = " + s1.substring(8));//verilen indeksten sonuna kadar alır
    }
}
