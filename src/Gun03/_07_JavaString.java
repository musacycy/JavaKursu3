package Gun03;

public class _07_JavaString {
    public static void main(String[] args) {

        int a=5;

        String name="Musa";
        String surName="Cici";//Cici \0 özel karakter koyarak sınırını belirliyor

        System.out.println("name");
        System.out.println(name);
        System.out.println("Name"+"Surname");
        System.out.println(name+surName);
        System.out.println(name+" "+surName);
        String fullName=name+surName;
        String fullName2=name+" "+surName;
        System.out.println("fullName = " + fullName);
        System.out.println("fullName2 = " + fullName2);

        int age =32;
        int weight = 76;
        
        String data = name+surName+age+weight;
        System.out.println("data = " + data);
    }
}
