package Gun09;

public class _02_JavaAritmeticOperators {
    public static void main(String[] args) {
        int sayac=0;
        sayac =sayac+1;
        sayac++;
        ++sayac;

        sayac=sayac-1;
        sayac--;
        --sayac;

        int sonuc=0;
        sonuc=sayac++;//önce işlemi sonra sayacı arttırıyor
                      // bu duruma göre sonuc=sayac,  sayac=sayac+1

        sayac=0;
        sonuc=++sayac;//önce sayac arttırılır sonra işlem yapılır
                       // sayac =sayac+1  ,  sonuc =sayac

    }
}
