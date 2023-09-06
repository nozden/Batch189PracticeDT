package practice02;

import java.util.Scanner;

public class C07StringManipulations {
    public static void main(String[] args) {
     /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ad ve soyadınızı aralarında bir boşluk olacak şekilde giriniz\n" +
                "Not:yalnızca bir ad, bir soyad girilmeli");
        String adSoyad=scan.nextLine();//kullanıcı bosluklu(space içeren) bir deger gireceği için nextLine sectik

        //substring ile ad ve soyadı ayrı ayrı alalım
        //indexOf methodu ile space in indexni bulalım
        int spaceIdx = adSoyad.indexOf(" ");
        //ad ı alalım substring
        String ad = adSoyad.substring(0,spaceIdx);//substringin 2 parametreli formu kullanılırken;
                                                  //ilk index dahil, ikinci index haric
        String soyad = adSoyad.substring(spaceIdx+1);

        String ad2= ad.toUpperCase().charAt(0) +  ad.toLowerCase().substring(1);
        String soyad2 = soyad.toUpperCase().charAt(0)   +  soyad.toLowerCase().substring(1);

        System.out.println("Ad : "+ ad2);
        System.out.println("Soyad : "+ soyad2);






    }
}
