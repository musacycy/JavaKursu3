package Gun21;

public class _03_JavaMethod {
    public static void main(String[] args) {
        String name="Musa";
        String surName="Cici";
        String fullName=Sum(name,surName);
        System.out.println("fullName = " + fullName);//aynı isimde iki method ama değişken tipleri farklı
        int number1=4;
        int number2=5;
        int sum=Sum(number1,number2);//aynı isimde iki method ama değişken tipleri farklı karışmıyor
        System.out.println("sum = " + sum);
    }

    public static String Sum(String name,String surName){
        return name+" "+surName;
    }
    public static int Sum(int number1,int number2){
        return number1+number2;
    }
}
