package Gun07;

public class _10_StringReplaceFirst {
    public static void main(String[] args) {
        // replace ile aynı sadece ilk bulunanı değiştitrir

        String text = "Merhaba Dünya";

        System.out.println("bütün a ları değiştir :"+text.replaceAll("a","_"));

        System.out.println("sadece ilk a yı değiştirir :"+text.replaceFirst("a","_"));
    }
}
