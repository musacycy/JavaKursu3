package Gun06;

public class _09_StringEqualsIgnoreCase {
    public static void main(String[] args) {
        //equal ile aynı çalışır büyük küçük harf ayırmaz
        
        String s1="Merhaba";
        String s2="MERHABA";
        
        boolean isEqual = s1.equalsIgnoreCase(s2);
        System.out.println("isEqual = " + isEqual);
    }
}
