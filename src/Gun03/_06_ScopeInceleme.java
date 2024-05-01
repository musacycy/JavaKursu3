package Gun03;

public class _06_ScopeInceleme {
    public static void main(String[] args) {
        int a = 7;// a değeri aşağıdaki parantez bölgesinde geçerlidir.

        {   // bu parantez arası kendie has bölge oluşturur
            // burada oluşturulan değişkenler kendi içinde kullanılır
            int b=5;
            b=77;
            a=8;
            System.out.println("b = " + b);
        }
        System.out.println("a = " + a);

    }
}
