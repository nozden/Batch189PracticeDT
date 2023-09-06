package practice01;

public class C04Concatenation {

    public static void main(String[] args) {
        /*2 tane string, 2 tane int data turunde variable olusturun
        String str1="Java";
        String str2="Güzel";
        int sayi1=5;
        int sayi2=3;
        Java5Güzel yazdırın
        8Java yazdırın
        Java8Guzel yazdırın
        2Güzel15 yazdırın
        Java22 yazdırın
        53Güzel yazdırın
         */

        String str1="Java";
        String str2="Guzel";
        int sayi1=5;
        int sayi2=3;
        //Java5Güzel yazdırın
        System.out.println(str1+sayi1+str2);

        //8Java yazdırın
        System.out.println(sayi1+sayi2+str1);

        //Java8Guzel yazdırın
        System.out.println(str1 + (sayi1 + sayi2)  + str2);

        //2Güzel15 yazdırın
        System.out.println(sayi1 - sayi2 +str2 + sayi1 * sayi2 );

        //Java22 yazdırın
        System.out.println(str1 + (sayi1 - sayi2) + (sayi1 - sayi2));

        System.out.println(str1 + (sayi1*sayi1-sayi2));

        //53Güzel yazdırın
        System.out.println(sayi1 + (sayi2 + str2));
        System.out.println("" + sayi1 + sayi2 + str2 );
        System.out.println(sayi1 + "" +sayi2 +str2);







    }//main method sonu
}//class sonu
