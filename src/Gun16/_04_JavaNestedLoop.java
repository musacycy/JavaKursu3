package Gun16;

public class _04_JavaNestedLoop {
    public static void main(String[] args) {
        //*****
        //****
        //***
        //**
        //*

        for(int i=1;i<=5;i++){
            for(int j=1;j<=6-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=5;i>0;i--){
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
