package Gun03;

public class _02_JavaDataTypes {
    public static void main(String[] args) {
        int sayi;
        // default olarak tam sayıların hepsini int kabul eder
        // default olarak ondalıklı sayıların hepsini double kabul eder
        byte byteDeger=127;
        short shortValue=1645;
        long longDeger=3323232401L;
        int intValue=25000;
        float folatValue=3.14F;// ondalıklı sayıları default olarak double kabul ettiğinden
                                // sonuna F eklendi sayıya hiçbir etkisi yoktur
        double doubleValue=3.14; // her iki taraf denk olduğu için ek bilgiye ihtiyaç duymuyor

        char basHarf=77;
        boolean evetMi=true;
        System.out.println("evetMi = " + evetMi);
        System.out.println("basHarf = " + basHarf);
        System.out.println("doubleValue = " + doubleValue);
        System.out.println("folatValue = " + folatValue);
        System.out.println("intValue = " + intValue);
        System.out.println("longDeger = " + longDeger);
        System.out.println("shortValue = " + shortValue);
        System.out.println("byteDeger = " + byteDeger);

    }
}
