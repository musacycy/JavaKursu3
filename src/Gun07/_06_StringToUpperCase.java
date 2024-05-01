package Gun07;

public class _06_StringToUpperCase {
    public static void main(String[] args) {
        //stringi büyük harfe çevirir

        String text="Merhaba Dünya";

        System.out.println("Büyük hali :"+text.toUpperCase());

        System.out.println("büyük küçük ya ile bitiyor mu:"+text.toUpperCase().endsWith("YA"));
    }
}
