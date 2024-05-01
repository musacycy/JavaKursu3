package Gun18;

import java.util.Arrays;

public class _04_JavaArrayMetodlar {
    public static void main(String[] args) {
        //Arrays.toString(dizi) diziyi string olarak direkt yazdırır
        String[] names={"ahmet","melike","sümeyra","inanç"};
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

        //diziyi sıralar
        Arrays.sort(names);
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));
        
        //Diziler eşit mi? Arrays.equals(dizi1,dizi2)
        int[] a={1,8,3,54};
        int[] b={1,8,3,54};
        int[] c={1,8,3,54};
        int[] d={1,8,3,5};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b));
        System.out.println("Arrays.equals(a,d) = " + Arrays.equals(a,d));
        Arrays.sort(c);
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));
        
        //Arrays.fill bütün kutucuklara atanan değeri doldurur
        Arrays.fill(c,7);
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));
        //Arrays.binarySearch(rakamlar,5) sıralı dizide aranan elemanın indeksini verir
        //aranan eleman birden fazla ise herhangi birini verebilir
        int[] rakamlar={2,7,4,6,23,5,5,5,6};
        System.out.println("Arrays.binarySearch(rakamlar,5) = " +Arrays.binarySearch(rakamlar,5));
        Arrays.sort(rakamlar);
        System.out.println("Arrays.binarySearch(rakamlar,5) = " + Arrays.binarySearch(rakamlar,5));

    }
}
