package practice01;


import java.util.Scanner;



public class C05Scanner {
    /*
    kullanıcıdan aldıgınız sayının karesini bulunuz
    not:bir sayının karesi,sayının kendisi ile carpımına esittir
     */
    public static void main(String[] args) {
        //kullanıcıdan veri almak için scanner kullanırız
        //1. adım scanner objesi olusturmak
        Scanner scan= new Scanner(System.in);

        //kullanıcıya mesaj verelim
        System.out.println("Lutfen karesini bulmak istediğiniz sayıyı giriniz");
        int sayi = scan.nextInt();
        //System.out.println(sayi);

        //girdiginiz sayının karesi : 529 'dur
        System.out.println("Girdiğiniz sayının karesi : "+sayi*sayi +" olarak bulunmustur");



    }

}
