package Gun25;

import java.util.HashMap;
import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        //canlı sözlük yapılmak isteniyor
        //kullanıcıya aşağıdaki gibi bir menü çıkarınız
        // 1-Ekleme bu seçenekte kelimenin kendisini ve manasını bir cümle ile yazdırınız
        //2- Düzeltme bu seçenekte kullanıcının kelimesnin manasını düzeltiyor
        //3-listeleme
        //4-arama bu seçenekte verilen bir kelimeyle başlayan tüm kelimelerin manasını düzeltiniz
        //5- Silme
        //6-çıkış
        HashMap<String,String> dictionary=new HashMap<>();
        Scanner scan=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        int chc=0;
        do {
            System.out.print("1-Ekleme\n"+
                             "2-Düzeltme\n"+
                             "3-Listeleme\n"+
                             "4-Arama\n"+
                             "5-Silme\n"+
                             "6-Çıkış =");
            chc=scan.nextInt();
            switch (chc){
                case 1:
                    System.out.print("Eklemek istediğiniz kelimeyi girin =");
                    String word=sc.nextLine();
                    System.out.print("Manasını Giriniz = ");
                    String mean=sc.nextLine();
                    dictionary.put(word,mean);break;
                case 2:
                    System.out.print("Düzeltmek istediğiniz kelimeyi girin= ");
                    String word1=sc.nextLine();
                    if (dictionary.containsKey(word1)){
                    System.out.print("Düzeltmek istediğiniz manayı girin= ");
                    String mean2=sc.nextLine();
                    dictionary.put(word1,mean2);
                    }
                    else System.out.println("Kelime mevcut değil");
                        break;
                case 3:
                    System.out.println("Sözlük"+dictionary);break;
                case 4:
                    System.out.print("Aramak istediğiniz kelimeyi girini =");
                    String word3= sc.nextLine();
                    System.out.println(dictionary.keySet().contains(word3));
                    if(dictionary.keySet().contains(word3)){
                        System.out.println(word3+" içeren kelimeler ="+dictionary.keySet().contains(word3));
                        System.out.print("Değiştirmek istediğiniz kelime girin =");
                        String word5=sc.nextLine();
                        System.out.print("Değiştirmek istediğiniz manayı girin =");
                        String mean3=sc.nextLine();
                        dictionary.put(word5,mean3);
                    }
                    else System.out.println("Aradığınız kelime bulunamamaktadır.");

                    break;
                case 5:
                    System.out.print("Silmek istediğiniz kelimenin adını girin =");
                    String word4=sc.nextLine();
                    dictionary.remove(word4);break;

            }

        }while (chc!=6);
        System.out.println("dictionary = " + dictionary);
    }
}
