package Gun07;

public class _08_StringReplace {
    public static void main(String[] args) {
        // string içindeki istenen karakter veya kareakterleri yenisiyle değiştirir

        String text ="Merhaba Dünya";

        System.out.println("Orjinal hali :"+text);

        System.out.println("a ların Değişmiş hali :"+text.replace("a","e"));
        System.out.println("ba ile de değiştir :"+text.replace("ba","de"));
        System.out.println("Dünay ile Java değiştir :"+text.replace("Dünya","Java"));
        System.out.println("a ları silelim :"+text.replace("a",""));

    }
}
