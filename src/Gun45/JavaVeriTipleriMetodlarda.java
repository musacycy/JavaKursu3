package Gun45;

import java.util.Arrays;

public class JavaVeriTipleriMetodlarda {
    int a1;
    static  int a2;

    static void metod2(){

    }
    void metod1(){

    }
    public static void main(String[] args) {
        JavaVeriTipleriMetodlarda j = new JavaVeriTipleriMetodlarda();
        j.a1=7;
        a2=8;
        j.metod1();
        metod2();
        int a=5;
        doProduct(a);
        System.out.println("a ="+a);
        int[] dizi1={1,2,3};
        doProduct2(dizi1);
        System.out.println("dizi1 ="+ Arrays.toString(dizi1));
    }
    public static void doProduct2(int[] dizi2){
        dizi2[0]=65;
    }
    public static void doProduct(int a){
        a=5*a;
    }
}
