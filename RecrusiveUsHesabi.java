package Giris;
import java.util.Scanner;

public class RecrusiveUsHesabi {

    static int us(int a,int b){
// 5^3=5*5*5
        int toplam = 1;
        for (int i=1; i<=b; i++){

            toplam = toplam * a;


        }
        return toplam;

    }





    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Kac Tane Islem Istiyorsunuz : ");
        int n;
        n= input.nextInt();


        for (int i = 1; i<=n; i++) {
            int a;
            int b;

            System.out.print("Taban Sayisini Giriniz : ");
            a = input.nextInt();
            System.out.print("Us Sayisini Giriniz : ");
            b = input.nextInt();

            System.out.println();

            System.out.println(us(a,b));
        }


    }

}

