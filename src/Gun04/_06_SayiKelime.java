package Gun04;

public class _06_SayiKelime {
    public static void main(String[] args) {
        String girilenKelime="65";
        System.out.println("girilenKelime = " + girilenKelime);

        int intDeger=Integer.parseInt(girilenKelime);
        double doubleDeger=Double.parseDouble(girilenKelime);
        System.out.println("int Değer" +intDeger);
        System.out.println("double Değer = " +doubleDeger);
        int toplam =intDeger+intDeger;
        System.out.println("toplam = " + toplam);
        // hava sıcaklığını rakam olarak tanımlayıp bir cümle şeklinde hava bugün ... derece yazınız
        int derece =12;
        System.out.println("Bugün hava "+derece+" derece");

        String dereceKelime=Integer.toString(derece);

        System.out.println("Bugün hava "+dereceKelime+" derece");
    }
}
