package Gun27._01_Ornek;

public class Ornek {
    public static void main(String[] args) {
        //1-Adım : Person isimli bir class tanımlayınız: name,surname,age
        //2-Adım: mainde 2 tane bu sınıftan nesne oluşturup değer atayınız
        //3-Adım : Bu değerleri yazdırınız
        //4-Adım : getBirthYear adında Person a ait bir metod yazınız
        //         çalıştığında kişinin doğum yılını versin
        //5-Adım : getInitials isminde kişinin adının ilk harfi soyadının ilk harfi
        //         şeklinde büyük harf veren metodu yazınız
        Person kisi1=new Person();
        kisi1.name="Hatice";
        kisi1.surname="Namlı";
        kisi1.age=20;

        Person kisi2=new Person();
        kisi2.name="Vasif";
        kisi2.surname="Zeynalov";
        kisi2.age=25;

        //1.yöntem
        System.out.println("kisi1.name = " + kisi1.name);
        System.out.println("kisi1.name = " + kisi1.surname);
        System.out.println("kisi1.name = " + kisi1.age);
        System.out.println();
        //2.yöntem
        BilgiYazdir(kisi1);
        BilgiYazdir(kisi2);

        System.out.println();
        //3.yöntem
        kisi1.BilgiYazdir();
        kisi2.BilgiYazdir();
        System.out.println();
        kisi1.getBirthYear();
        kisi2.getBirthYear();
        kisi1.getInitials();
        kisi2.getInitials();
    }

    public static void BilgiYazdir(Person kisi){
        System.out.println("kisi.name = " + kisi.name);
        System.out.println("kisi.name = " + kisi.surname);
        System.out.println("kisi.name = " + kisi.age);
    }
}
