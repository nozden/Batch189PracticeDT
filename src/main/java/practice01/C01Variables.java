package practice01;

public class C01Variables {

    public static void main(String[] args) {

        //(int) bir variable(yas)  olustur ve yazdır
        //syntax:
        //data turu  +   variable ismi  +  atama operatoru  + variable degeri  ;
         int              yas                =                35               ;

        System.out.println(yas);

        //(int) bir variable(sayi)  olustur ve yazdır


        int sayi = 50 ;

        System.out.println(sayi);
        System.out.println(sayi);
        System.out.println(sayi);
        System.out.println(sayi);
        System.out.println(sayi);//ctrl d diyerek o satırı alt alta cogaltabilirsiniz


        //konsola sayi = 50 seklinde yazdır
        System.out.println("sayi = " + sayi );//etiketiyle(ismiyle) yazdırma işlemi

        System.out.println("sayi = " + sayi);
        //soutv

        //yeni bir variable olustur(benimYasim) ve yas variable'inin degerini benimYasim variable'ına kopyala
        int benimYasim = yas ;

        System.out.println("benimYasim = " + benimYasim);


        //String bir variable olusturalım (isim)
        String isim = "Can";

        //isim variable ını etiketıyle yazdır
        System.out.println("isim = " + isim);

        //onunIsmi variable'ı olustur ve isim variable'ının degerini onunIsmi variable'ına kopyala
        String onunIsmi = isim;

        //onunIsmi variable'ını etiketiyle yazdır
        System.out.println("onunIsmi = " + onunIsmi);

        //isim variable'ının degerini guncelle
        isim = "Ali";
        System.out.println("isim = " + isim);//Ali

        System.out.println("onunIsmi = " + onunIsmi);//Can


        //isim ve onunIsmi variable'larını yazdır





    }//main methodun sonu

}//class sonu



