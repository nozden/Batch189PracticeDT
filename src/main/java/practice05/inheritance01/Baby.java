package practice05.inheritance01;

public class Baby extends Child{

    int kilo=45;

    public static void main(String[] args) {

        method1();
        method2();
        System.out.println("isim = " + isim);
        System.out.println("soyisim = " + soyisim);

        Baby obj3=new Baby();
        obj3.method3();
        obj3.method4();
        System.out.println("obj3.yas = " + obj3.yas);

        System.out.println("obj3.kilo = " + obj3.kilo);

        Child obj4=new Child();
        //obj4.kilo

    }




}
