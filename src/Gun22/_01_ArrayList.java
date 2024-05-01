package Gun22;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // array: boyutu belli olan veriler için kullanılır

        int[] array=new int[5];//5 elemanlı bir dizi eleman sayısı değiştiirilmez

        //ArrayList: boyutu dinamik olarak artan ve azalan diziler
        ArrayList<Integer> integerList =new ArrayList<>();
        ArrayList<Boolean> booleanList =new ArrayList<>();
        ArrayList<String> stringArrayList=new ArrayList<>();

        //String arraylist tanımlayalım

        ArrayList<String> names=new ArrayList<>();

        //eleman ekleme
        names.add("Ahmet");//uzunluğu 1
        names.add("Mehmet");//uzunluğu 2
        names.add("Ali");//uzunluğu 3
        names.add("Hakkı");//uzunluğu 4
        System.out.println("names = " + names);
        System.out.println("names uzunluğu = " + names.size());//dizilerdeki lengthe karşılık geliyor
        names.add(1,"memo");// belli biir indekse eleman ekleme
        System.out.println("names = " + names);
        names.set(1,"Memo");//belli bir indeksteki elemanı değiştirme
        System.out.println("names = " + names);
        int elemancount=names.size(); //dizideki eleman sayısı
        System.out.println("elemancount = " + elemancount);
        names.remove("Ali"); // dizideki elemanı isme göre siler
        System.out.println("elemancount = " + names);
        names.remove(3);//dizideki elemanı indekse göre siler
        System.out.println("elemancount = " + names);
        
        int indexofAhmet=names.indexOf("Ahmet");//dizideki elemanın indeksini verir
        System.out.println("indexofAhmet = " + indexofAhmet);
        for (int i = 0; i < names.size(); i++) {
            System.out.println("names.get(i) = " + names.get(i));//belirli bir indeksteki elemanı alır
        }
        names.clear();//dizinin içini boşaltır
        System.out.println("names = " + names);
        }

}
