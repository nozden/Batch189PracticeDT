package practice03;

import java.util.Scanner;

public class C01ForLoop {
    /*
            Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
           */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next();

        //stringteki ch tek tek --->charAt(index)

        int sayac=0;
        for (int i = 0; i <kelime.length() ; i++) {

            if (kelime.charAt(i)=='a'){
                sayac++;
            } else if (kelime.charAt(i)=='c') {
                break;//loopu kırar
            }

        }//for loop sonu

        System.out.println("Ilk c harfine kadar olan a harflerinin sayisi : " + sayac);



    }
}
