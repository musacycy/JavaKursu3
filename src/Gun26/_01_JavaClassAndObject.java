package Gun26;

import java.util.Scanner;

public class _01_JavaClassAndObject {
    //metodun yaılabildiği yer
    public static void main(String[] args) {
        //Ana programın başladığı ve çalıştığı yer
        int number=5;
        Scanner scan= new Scanner(System.in);

        Araba myCar=new Araba();
        myCar.colour="Kırmızı";
        myCar.engine=1600;
        myCar.year=2022;
        System.out.println("benimarabamın rengi ="+myCar.colour);
    }
    //metodun yaılabildiği yer

}

class Araba{//bu bölüme class diyoruz ve bu şekilde tanımlanıyor bir tane public class olur o da dosyanın ismiyle
    String colour;
    int year;
    double engine;
}
