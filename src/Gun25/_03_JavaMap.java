package Gun25;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _03_JavaMap {
    public static void main(String[] args) {
        Map<Integer,String> hm=new HashMap<>();
        hm.put(9,"tilki");
        hm.put(2,"kedi");
        hm.put(30,"dog");
        hm.put(4,"kurt");
        hm.put(11,"yılan");
        System.out.println("hm = " + hm);
        Map<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(9,"tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"dog");
        lhm.put(4,"kurt");
        lhm.put(11,"yılan");
        System.out.println("lhm = " + lhm);
        Map<Integer,String> thm=new TreeMap<>();
        thm.put(9,"tilki");
        thm.put(2,"kedi");
        thm.put(30,"dog");
        thm.put(4,"kurt");
        thm.put(11,"yılan");
        System.out.println("thm = " + thm);
    }
}
