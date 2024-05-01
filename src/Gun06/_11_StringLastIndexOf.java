package Gun06;

public class _11_StringLastIndexOf {
    public static void main(String[] args) {
        //Indexof gibi çalışır ama sondan itibaren indexi verir

        String s1="Merhaba";
        System.out.println("Baştan a nın indeksi :"+s1.indexOf("a"));
        System.out.println("Sondan a nın indeksi :"+s1.lastIndexOf("a"));
        //indeks her zaman soldan sayar sadece yönü değitirir
    }
}
