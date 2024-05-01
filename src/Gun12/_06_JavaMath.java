package Gun12;

public class _06_JavaMath {
    public static void main(String[] args) {
        int a=-12;
        int b=4;

        System.out.println("a nın mutlak değeri :"+Math.abs(a));
        System.out.println("a ve b den büyük olan :"+Math.max(a,b));
        System.out.println("a ve b den küçüğk olanı :"+Math.min(a,b));
        System.out.println("a nın karekökü :"+Math.sqrt(a));
        System.out.println(" 2 üzeri 3 :"+Math.pow(2,3));
        System.out.println("round 3.1 :"+Math.round(3.1));
        System.out.println("ceil 3.1 :"+Math.ceil(3.1));//bu rakamdan büyük en küçük tam sayı
        System.out.println("floor 3.1 :"+Math.floor(3.1));
    }
}
