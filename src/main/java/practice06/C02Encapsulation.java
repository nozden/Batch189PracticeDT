package practice06;

public class C02Encapsulation {


    public static void main(String[] args) {
        //Ali, Can, 25 ozelliklerine sahip bir obje olusturunuzz ve yazdırınız
        C01Encapsulation obj=new C01Encapsulation("ali","Can",25);
        System.out.println(obj.getIsim());
        System.out.println(obj.getYas());
        System.out.println(obj.getSoyisim());
        System.out.println(obj);

        //objenin yasını 30 olarak guncelleyin
        obj.setYas(30);
        System.out.println(obj.getYas());

        //parametresiz cons kullanarak 2. bir obje olusturun
        C01Encapsulation obj2=new C01Encapsulation();
        System.out.println(obj2);

        //Ayse, Yilmaz, 40 degerlerini atayın
        obj2.setIsim("ayse");
        obj2.setSoyisim("Yilmaz");
        obj2.setYas(40);
        System.out.println(obj2);

        //yas ı -5 olarak guncelleyin
        obj2.setYas(-5);
        System.out.println(obj2.getYas());
        //yas negatif deger alamayacak sekilde set methodunu guncelleyin

        //isim kucuk harfle baslamayacak sekilde set methodunu guncelleyin


        //isim kucuk harfle baslamayacak sekilde parametreli constructoru guncelleyin

    }
}
