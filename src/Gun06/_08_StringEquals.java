package Gun06;

public class _08_StringEquals {
    public static void main(String[] args) {
        // 2 string eşit olup olmadığını kontrol eder
        // sonuç boolean döner
        String s1="Merhaba";
        String s2="MERHABA";
        boolean isEqual = s1.equals(s2);
        System.out.println("isEqual = " + isEqual);
        System.out.println("isEqual = " + s1.equals(s2));
        System.out.println("isEqual = " + s1.equals("Merhaba"));
    }
}
