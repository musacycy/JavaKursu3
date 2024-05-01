package Gun27._01_Ornek;

import java.util.Locale;

public class Person {
    String name;
    String surname;
    int age;

    public void BilgiYazdir(){
        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
        System.out.println("age = " + age);
    }
    public void getBirthYear(){
        System.out.println("Doğum Yılı = " + (2022-age));
    }
    public void getInitials(){
        System.out.println(name.toUpperCase().charAt(0)+"."+surname.toUpperCase().charAt(0));
    }
}
