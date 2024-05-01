package Gun28._01_Ornek;

import org.w3c.dom.css.CSSStyleDeclaration;

public class JavaStaticveNonStaticMetodlar {
    public static void main(String[] args) {


        int sayi=345;
        String strRakam=String.valueOf(sayi);
        int intRakam=Integer.parseInt(strRakam);


        Utility util=new Utility();
        strRakam=util.getString(sayi);
        intRakam=util.getInteger(strRakam);


        Math.max(1,4);

        strRakam=Utility.getString2(sayi);
        intRakam=Utility.getInteger2(strRakam);
        System.out.println("strRakam ="+strRakam);
        System.out.println("intRakam ="+intRakam);

    }
}
