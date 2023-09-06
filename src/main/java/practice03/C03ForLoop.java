package practice03;

import java.util.Scanner;

public class C03ForLoop {

    public static void main(String[] args) {

            /*
            Kullanıcıdan sisteme satır sayısını girmesini isteyiniz.
            ve ardından yıldız işaretini kullanarak bir dik üçgen çizin

            Satır sayısı = 4 ==>      *
                                      * *
                                      * * *
                                      * * * *
            */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen satir sayisini sisteme giriniz");
        int satirSayisi= scan.nextInt();


        for (int i = 1; i < satirSayisi; i++) {//satırlar için

            for (int j = 0; j <= i ; j++) {//sutun için(* yazdırma islemi icin)

                System.out.print("* ");
            }

            System.out.println();
        }



    }


}
