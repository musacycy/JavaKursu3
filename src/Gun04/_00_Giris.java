package Gun04;

public class _00_Giris {

            public static void main(String[] args) {
                byte ogr1Not=90;

                int notToplam=ogr1Not; // byte türü int türüne dönüşürken
                // veri kaybı olmayacağı için uyarı vermiyor
                ogr1Not = (byte)notToplam; // int turune byte turune dönüştürürken
                // bunu bilerek yaptığımızı belirtmemiz gerekir

            }
        }

