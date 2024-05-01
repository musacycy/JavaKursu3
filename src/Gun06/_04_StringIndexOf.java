package Gun06;

public class _04_StringIndexOf {
    public static void main(String[] args) {
        //verilen karakterin stringin içindeki indexini verir
        //Merhaba kelimesindeki r nin indeksini bulmak istersek kelime.IndexOf("r")

        String kelime ="Merhaba Dünya";
        int index =kelime.indexOf("a");
        System.out.println("index = " + kelime.indexOf("r"));
        System.out.println("index = " + kelime.indexOf("ha"));
        System.out.println("index = " + kelime.indexOf("a"));
        System.out.println("index = " + kelime.indexOf("ny"));
        System.out.println("index = " + kelime.indexOf(" "));
        System.out.println("index = " + kelime.indexOf("A"));
        System.out.println("index = " + kelime.indexOf("a",5));//4 ten sonrakileri araştırır
    }
}
