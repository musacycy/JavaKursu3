package Gun07;

public class _03_StringEndWith {
    public static void main(String[] args) {
        // endswith :... ile bitiyor mu sonuç boolean döner

        String text = "Merhaba Dünya";

        System.out.println("a ile bitiyor mu : "+text.endsWith("a"));
        System.out.println("ya ile bitiyor mu : "+text.endsWith("ya"));
        System.out.println("ba ile bitiyor mu : "+text.endsWith("ba"));
        System.out.println("mn ile bitiyor mu : "+text.endsWith("mn"));
    }
}
