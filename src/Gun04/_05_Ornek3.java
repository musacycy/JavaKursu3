package Gun04;

public class _05_Ornek3 {
    public static void main(String[] args) {
        //kişinin ağırlığını double boyunu int olarak değerler veriniz ve bir satırda
        // Boyunuz: ve kilonuz: şeklinde yazınız
        // vücut kitle indeksi bulunuz (kg/boy*boy)

        double weight=76.5;
        int height = 180;
        double height2=(double)height/100;
        double kitle = weight/(height2*height2);
        int  kitle2 = (int)(weight/(height2*height2));

        System.out.println("Boyunuz:"+height2+"m"+"Kilonuz:"+weight+"kg");
        System.out.println("Kitle endeksiniz:"+kitle);
        System.out.println("Kitle endeksiniz:"+kitle2);
    }
}
