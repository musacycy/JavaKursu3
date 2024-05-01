package Gun12;

public class _08_JavaRandom {
    public static void main(String[] args) {
        //0 ile 6 arasında sayı üreten programı yazınız

        // Math.random() -> 0.000-0.00000 arasında sayı üretir

        double randomNUmber=Math.random();
        System.out.println("Sayı :"+randomNUmber);

        int integerNumber=(int)(randomNUmber*6);
        System.out.println("Sayı :"+integerNumber);

    }
}
