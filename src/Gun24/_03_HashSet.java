package Gun24;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class _03_HashSet {
    public static void main(String[] args) {
        HashSet<String> colours=new HashSet<>();
        colours.add("Red");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Red");//bu çıkmaz
        colours.add("RED");//bu çıkar

        System.out.println("colours = " + colours);

        //ekrana tek tek yazdırma 2.yöntem

        for (String s:colours)//renklerin içindeki elemanları herhangi bir sırayla s ismini vererek gönderiyor
        {
            System.out.println("Colours = " + s);
        }
        //bunları kendi içinde sıralı olanların sırasına göre nasıl yazdırabilirim.Treeset ve Linkedset

        TreeSet<String> ths=new TreeSet<>();
        ths.add("bir");
        ths.add("iki");
        ths.add("üç");
        ths.add("dört");
        ths.add("beş");
        System.out.println("ths = " + ths);

        for (String s:ths) {//sırayı garanti etmiyor
            System.out.println("s = " + s);
        }
        Iterator gosterge=ths.iterator();
        while (gosterge.hasNext())//set lerde kendi sırasına göre elemanlara ulaşmak için
        {
            System.out.println("gosterge.next() = " + gosterge.next());//sıradaki elemanı gösteriyor
        }
    }
}
