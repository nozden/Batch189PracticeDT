package practice05.inheritance02;

import java.util.ArrayList;
import java.util.List;

public class Corsa extends Opel{

    String hiz="Corsa arabalar max 200 km hiz yapar";
    String yakit="Corsa arabalar benzinli veya elektriklidir";
    String model="Corsa";
    @Override
    protected void motor() {
        System.out.println("Corsa arabalar cevreci motor kullanırlar");
    }
    @Override
    protected void yakitTuketimi() {
        System.out.println("Corsa arabalar 5.6lt yakıt tuketir");
    }
    protected void vitesSayisi(){
        System.out.println("Corsalar 5 viteslidir");
    }

    public static void main(String[] args) {
        //Corsa objesi olusturalım
        Corsa arb1=new Corsa();
        System.out.println("arb1.hareket = " + arb1.hareket);//Araba
        System.out.println("arb1.hiz = " + arb1.hiz);//corsa
        System.out.println("arb1.yakit = " + arb1.yakit);//corsa
        System.out.println("arb1.marka = " + arb1.marka);//opel
        System.out.println("arb1.sirketMerkezi = " + arb1.sirketMerkezi);//opel
        System.out.println("arb1.model = " + arb1.model);//corsa

        arb1.motor();//corsa

        Opel arb2=new Corsa();
        System.out.println("arb2.hareket = " + arb2.hareket);//araba
        System.out.println("arb2.hiz = " + arb2.hiz);//opel
        System.out.println("arb2.yakit = " + arb2.yakit);//araba
        System.out.println("arb2.marka = " + arb2.marka);//opel
        System.out.println("arb2.sirketMerkezi = " + arb2.sirketMerkezi);//opel

        arb2.motor();
        /*
        inheriatnceda variablelar;
        aramaya data turunden baslanır, bulamazsa parenta bakar,
        ilk buldugunu getirir
         */
        /*
        inheritanceda methodlar;
        aramaya data turunden baslanır, bulamazsa parenta bakar.
        ilk buldugu yerden almaz, constructorın oldugu yere kadar override
        edilmiş mi diye bakar ve son buldugunu getirir
         */
        //arama işlemi asagıdan yukarı dogrudur
        //override kontrol işlemi yukarıdan asagı dogrudur
        arb2.garanti();//opel
        arb2.yakitTuketimi();//corsa

        //arb2.vitesSayisi()-->CTE

        Araba arb3=new Corsa();
        System.out.println("arb3.hareket = " + arb3.hareket);//araba
        System.out.println("arb3.hiz = " + arb3.hiz);//araba
        System.out.println("arb3.yakit = " + arb3.yakit);//araba
        //  arb3.model  CTE
        arb3.motor();//corsa
        arb3.yakitTuketimi();//corsa
        // arb3.garanti

        Araba arb4=new Opel();

        System.out.println("arb4.hiz = " + arb4.hiz);//araba
        System.out.println("arb4.yakit = " + arb4.yakit);//araba

        arb4.motor();//opel
        arb4.yakitTuketimi();//araba
        //arb4.garanti()  CTE


    }

}
