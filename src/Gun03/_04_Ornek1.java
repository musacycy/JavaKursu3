package Gun03;

public class _04_Ornek1 {
    public static void main(String[] args) {
        //iki kenarı tanımlı olarak verilen
        //bir dikdörtgenin alanını ve çevresini bulunuz

        int shortSide=5;
        int longSide=6;
        int area = shortSide*longSide;
        int perimeter = 2*(shortSide+longSide);

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }
}
