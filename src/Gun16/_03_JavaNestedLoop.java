package Gun16;

public class _03_JavaNestedLoop {
    public static void main(String[] args) {
        //aşağıdaki görüntüyü veren programı yazınız
        //*
        //**
        //***
        //****
        //*****
        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
