package practice05.inheritance02;

public class Araba {

    // Araba, Opel, Corsa adında farklı class'lar olusturunuz.
    // Opel class'ı Araba class'ına baglı olacak
    // Corsa class'ı Opel class'ına baglı olacak
    // Araba class'ına genel bilgileri, variable ve method olarak yazınız.
    // Opel class'ına gerekli bilgileri, variable ve method olarak yazınız.
    // Corsa class'ına en spesifik bilgileri, variable ve method olarak yazınız.
    // Corsa class'ından obje olusturarak variableları ve methodları yazdırınız.


    //tum arabalar icin ortak olan özellikleri variable olarak tanımlayalım

    String hareket="Arabalar teker ile hareket eder";
    String marka="Arabalar uretildikleri markaya sahiptir";
    String hiz="Arabalar motor gucune gore hareket eder";
    String yakit="Arabalar farklı turde yakıtlar kullanırlar";

    //tum arabalar icin ortak ozellikleri method olarak yazalım

    protected void motor(){
        System.out.println("Arabalar farklı markalarda motor kullanırlar");
    }
    protected void yakitTuketimi(){
        System.out.println("Arabalar motor gucune ve yakit turune gore yakıt kullanırlar");
    }


}
