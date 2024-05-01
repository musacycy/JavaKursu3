package Gun04;

public class _08_Ornek {
    public static void main(String[] args) {
        // string olarak verilen iki bağız parasının toplamını bulunuz

        String bagis1="500";
        String bagis2 ="300";

        System.out.println("Toplam bağış :"+bagis1+bagis2);

        int intbagis1=Integer.parseInt(bagis1);
        int intbagis2=Integer.parseInt(bagis2);
        int toplam = intbagis1+intbagis2;

        System.out.println("Toplam bağış :"+toplam);
    }
}
