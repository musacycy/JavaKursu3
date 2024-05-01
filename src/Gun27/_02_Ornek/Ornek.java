package Gun27._02_Ornek;

public class Ornek {
    public static void main(String[] args) {
        //1-Adım : Rectangle isminde ayrı bir dosyada olmak üzere sınıf yazının fields : width,length
        //2-Adım : Çevre bulmak üzere Cevre isminde bir metod yazınınz
        //3-Adım : Dikdörtgenin alanını bulan Alan isimli metod yazınız

        Rectangle rctn=new Rectangle();
        rctn.length=17;
        rctn.width=12;
        rctn.cevre();
        rctn.alan();
        
        int alan=rctn.alan2();
        System.out.println("alan = " + alan);
    }
}
