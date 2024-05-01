package Gun24;

import java.util.HashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> setA=new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);
        setA.add(6);
        setA.add(7);
        HashSet<Integer> setB=new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);
        HashSet<Integer> addedSet=new HashSet<>();
        addedSet.addAll(setA);// AddAll ve RemoveAll aynı zamanda Arraylistlerde de geçerli
        addedSet.addAll(setB);

        System.out.println("setA = " + setA);
        System.out.println("setB = " + setB);
        System.out.println("eklenmiş hali = " + addedSet);
        
        HashSet<Integer> removeSet=new HashSet<>();
        removeSet.addAll(setA);
        removeSet.removeAll(setB);
        System.out.println("removeSet = " + removeSet);
        
        HashSet<Integer>  ortakElemanlar=new HashSet<>();
        ortakElemanlar.addAll(setA);
        ortakElemanlar.retainAll(setB);
        System.out.println("ortakElemanlar = " + ortakElemanlar);
    }
}
