package Gun06;

public class _07_StringContains {
    public static void main(String[] args) {
        //bir stringin içinde karakterlerin var olup olmadığını söyler
        // boolean cinsinden döner

        String kelime ="Merhaba Dünya";
        boolean isThere =kelime.contains("a");
        System.out.println("isThere = " + isThere);
        System.out.println("isThere = " + kelime.contains("f"));
        System.out.println("isThere = " +kelime.contains("Ben"));
    }
}
