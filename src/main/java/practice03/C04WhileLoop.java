package practice03;

import java.util.Scanner;

public class C04WhileLoop {
    // Kullanıcından sisteme bir sayi girmesini isteyiniz,
    // kullanıcının girdigi sayıdan baslayarak, 10'un katına gelene kadar ardısık yazdırınız
    // Not: While loop kullanınız
    // Örn: Sayı: 41
    //      Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49

    public static void main(String[] args) {


        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");

        int sayi= scan.nextInt();

        while ( sayi%10!=0 ){


            if (sayi%10==9){
                System.out.println(sayi);
            }else{
                System.out.print(sayi+", ");
            }


            sayi++;
        }
 


    }
}
