package Gun27._03_Ornek;

public class ElektrikHesabi {
    int toplamTuketim=0;
    double birimfiyat=0.7;
    double fatura=0;

    public void tuketimEkle(int tuketim){
        toplamTuketim+=tuketim;
    }
    public void toplamTuketimYaz(){
        System.out.println("toplamTuketim = " + toplamTuketim);
    }
    public void odenecekTutar(){
        fatura=birimfiyat*toplamTuketim;
        System.out.println("Fatura = " +fatura );
    }

}
