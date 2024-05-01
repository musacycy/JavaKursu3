package Gun20;

import java.util.Scanner;

public class _06_JavaMethod {
    public static void main(String[] args) {
        //Kullanıcıdan aşağıdaki gibi bir menüyü çıkartarak sürekli değişkenleri alınız ve
        //her bir menü elemanını değer alan bir fonksiyon olarak yazınız
        /*
            1.toplama
            2.çıkarma
            3.çarpma
            4.bölme
            5.faktöriyel
            6.çıkış
         */
        Scanner scan = new Scanner(System.in);
        int choice =0;
        do {
            menuPrint();
            choice=scan.nextInt();
            doCalculate(choice);
        } while (choice < 6 && choice>0);
    }

    public static void menuPrint() {
        System.out.print("1.Toplama \n"+"2.Çıkarma \n"+"3.Bölme \n"+"4.Çarpma \n"+"5.Faktöriyel \n"+"Seçiminiz =\n");

    }
    public static void sumPrint(int number1,int number2){
        System.out.println(number1+number2);
    }
    public static void minusPrint(int number1,int number2){
        System.out.println(number1-number2);
    }
    public static void multiPrint(int number1,int number2){
        System.out.println(number1*number2);
    }
    public static void divPrint(int number1,int number2){
        System.out.println(number1/number2);
    }
    public static void facPrint(int number1){
        int factor=1;
        for (int i = 1; i <=number1 ; i++) {
            factor=factor*i;
        }
        System.out.println(factor);
    }
    public static void doCalculate(int choice){
        Scanner scan=new Scanner(System.in);
        int number1=0;
        int number2=0;
        if(choice<5){
            System.out.print("1.sayıyı giriniz :");
            number1=scan.nextInt();
            System.out.print("2.Sayıyı giriniz :");
            number2=scan.nextInt();
        }
        else{
            System.out.print("1.Sayıyı giriniz = ");
            number1=scan.nextInt();
        }
        switch (choice){
            case 1:
                sumPrint(number1,number2);break;
                //System.out.println(number1+number2);break;
            case 2:
                minusPrint(number1,number2);break;
                //System.out.println(number1-number2);break;
            case 3:
                multiPrint(number1,number2);break;
                //System.out.println(number1*number2);break;
            case 4:
                divPrint(number1,number2);
                //System.out.println(number1/number2);break;
            case 5:
                facPrint(number1);
                /*int factor=1;
                for (int i = 1; i <=number1 ; i++) {
                    factor=factor*i;

                }
                System.out.println("çarpım ="+factor);*/
        }

    }



}
