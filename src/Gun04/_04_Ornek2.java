package Gun04;

public class _04_Ornek2 {
    public static void main(String[] args) {
        // 1 tane double 1 tane short değişken tanımlayıp değer atayınız sonra
        // double değişkeni short değişşkene çevirerek bütün dğerleri tekrar yazdırınız

        double deger1=2.71;
        short deger2=1;
        deger2=(short) deger1;
        System.out.println("deger2 = " + deger2);
        System.out.println("deger1 = " + deger1);

    }
}
