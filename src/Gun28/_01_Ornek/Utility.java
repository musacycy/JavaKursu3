package Gun28._01_Ornek;

public class Utility {

  //2.yöntem nesneye ait metodlar
    public String getString(int sayi){

        return String.valueOf(sayi);
    }

    public int getInteger(String strRakam){
        return Integer.parseInt(strRakam);
    }

    //3.yöntem  Classsa ait metodlar
    public static String getString2(int sayi){

        return String.valueOf(sayi);
    }

    public static int getInteger2(String strRakam){
        return Integer.parseInt(strRakam);
    }
}
