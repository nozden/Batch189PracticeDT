package practice01;

public class C03KimlikBilgileri {
    public static void main(String[] args) {

      /*
         isim, soyisim, yas, boy ve kilo değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
            Isim:. ..
            Soyisim: ...
            Yas: ...
            Boy: ...
            Kilo: ...
    Not: Sadece bir adet "System.out.println(); kullanınız.

    */
       String isim = "Ali" ;
       String soyisim = "Can" ;
       byte yas = 25 ;
       double boy = 1.80 ;//ondalıklı sayıları kodumuzda nokta ile ifade ederiz
       byte kilo = 78 ;

        //Isim: Ali
        //isim = Ali  --> soutv bu sekılde yazdırır
        System.out.println("Isim: " + isim + "\nSoyisim: " + soyisim + "\nYas: "+ yas +"\nBoy: " +boy+"\nKilo: " +kilo );


        // \n işareti imleci konsolda bir alt satıra gecirir, "" içinde yazılır





    }//main method sonu


}//class sonu
