package Gun07;

public class _09_StringReplaceAll {
    public static void main(String[] args) {
        // replace gibi çalışır  farkı kriter (Regex)
        //regex: regule expression düzenli ifade
        // todo : regex olarak neler yazılabiliyor googledan araştırılacak

        String text= "Merhaba Dünya";

        System.out.println("Orjinal hali :"+text);

        System.out.println("a b n karakterlierimi _ ile değişir : "+text.replaceAll("[abn]","_"));
        //büyük harfleri "_" ile değiştir

        System.out.println("büyük harfler '_' ile değiştir : "+text.replaceAll("[A-Z]","_"));
    }
}
