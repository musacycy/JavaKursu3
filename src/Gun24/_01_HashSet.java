package Gun24;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {
        int sayi=5;//hafızada bir sayı tutuyo
        int[] dizi = new int[5]; //hafızada 5 rakam tutuyor
        int[][] tablo =new int[3][4];// 12 adet sayı tutuyor
        
        //dinamik boyutlu dizilert

        ArrayList<Integer> liste= new ArrayList<>();//boyu eklendikçe artan dinamik dizi
        ArrayList<ArrayList<Integer>> listelerinlistesi=new ArrayList<>();//dinamik iki boyutlu 
        
        //bana artık elemanları gelişigüzel miktarınca tutan değil aynı elemanları tutmayan
        //yani 1 elemandan sadece 1 tane olan diziler lazım hangi sırada olduğunun önemi yok
        //bunlara SET denir:LINKEDHASHSET(ekleme sırasına göre),TREESET(ordered sıralı),HASHSET(hızlı)
        HashSet<Integer> hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(22);
        hs1.add(4);
        hs1.add(5);
        boolean eklendiMi=hs1.add(5);
        System.out.println("eklendiMi = " + eklendiMi);
        System.out.println("hs1 = " + hs1);



    }
}
