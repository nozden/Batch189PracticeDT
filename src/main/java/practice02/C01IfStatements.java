package practice02;

import java.util.Scanner;

public class C01IfStatements {

    public static void main(String[] args) {

        //kullanıcıdan iki sayı isteyin
        //sayıların ikisi de pozitifse sayıların toplamını yazdırın
        //ikisi de negatifse sayıların çarpımını yazdırın
        //ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın
        //sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        int sayi1=input.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2=input.nextInt();

        if (sayi1>0  && sayi2>0){
            System.out.println(sayi1+sayi2);
        } else if (sayi1<0 && sayi2<0) {
            System.out.println(sayi1*sayi2);
        } else if (sayi1>0 && sayi2<0 || sayi1<0 && sayi2>0 ) {//sayi1*sayi2<0
            System.out.println("Farkli işaretli sayılarla işlem yapamazsin");
        } else {//baska durum kalmadıgı için else kullanalım
            System.out.println("Sıfır carpmaya gore yutan elemandir");
        }


    }
}
