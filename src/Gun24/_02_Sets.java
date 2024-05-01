package Gun24;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        // SETS: HashSet(hızlı,LinkedHashSet(ekleme sırasına göre),TreeSet(her zaman sıralı)


        //Hızlı çalışmak için kendi özel algoritma sırasına göre saklar
        HashSet<String> hs = new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        System.out.println("hs = " + hs);

        //eklenme sırasına göre

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");
        System.out.println("lhs = " + lhs);

        //treeset alfabetik olarak
        TreeSet<String>  ths=new TreeSet<>();
        ths.add("bir");
        ths.add("iki");
        ths.add("üç");
        ths.add("dört");
        ths.add("beş");
        System.out.println("ths = " + ths);
        //sayısal sıraya göre sıralı tutar
        TreeSet<Integer>  ts2=new TreeSet<>();
        ts2.add(17);
        ts2.add(2);
        ts2.add(34);
        ts2.add(24);
        ts2.add(52);
        System.out.println("ts2 = " + ts2);
    }
}
