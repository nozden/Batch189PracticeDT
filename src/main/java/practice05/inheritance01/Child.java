package practice05.inheritance01;

public class Child extends Parent {

    int yas = 10;

    public static void main(String[] args) {
        Parent.method1();
        method1();//static method child classtaki static main methoddan direk cagrılabilir
        method2();
        System.out.println("isim = " + isim);
        System.out.println("soyisim = " + soyisim);
        isim="Veli";
        System.out.println("isim = " + isim);
        //instance var/meth static baska bir methodun içinden obje olusturularak cagrılır

        Parent obj1=new Parent();
        obj1.method3();
        obj1.method4();
        System.out.println("obj1.yas = " + obj1.yas);//obj1.yas = 30

        Child obj2=new Child();
        obj2.method3();
        obj2.method4();
        System.out.println("obj2.yas = " + obj2.yas);//obj2.yas = 10


    }


}
