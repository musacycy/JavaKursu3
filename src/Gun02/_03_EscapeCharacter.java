package Gun02;

public class _03_EscapeCharacter {
    public static void main(String[] args) {
        // escape character
        // \n -> yeni satır
        // \t -> tab tuşuna basılmış etki yapar
        // \b -> Backspace tuşuna basılmış gibi etkii yapar bir kararkter geri siler
        // \" -> çift tırnak yazar
        // \\ -> \ işaretini koyar
        // \r ->  satır başına kadar olan karaterlerin hepsini siler
        System.out.println("Merhaba \nDünya");
        System.out.println("Merhaba \tDünya");
        System.out.println("Merhaba \bDünya");
        System.out.println("Merhaba \"Dünya");
        System.out.println("Merhaba \\Dünya");
        System.out.println("Merhaba \rDünya");
    }
}
