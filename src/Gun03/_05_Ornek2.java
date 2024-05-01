package Gun03;

public class _05_Ornek2 {
    public static void main(String[] args) {
        // yarı çapı verilen bir dairenin çevresini ve alanını bulunuz

        float pi=3.14F;
        int r=3;
        float perimeter = 2*pi*r;
        double area = pi*Math.pow(r,2);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }
}
