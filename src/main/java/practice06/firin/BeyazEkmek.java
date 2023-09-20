package practice06.firin;

public abstract class BeyazEkmek implements Ekmek{

    //beyaz ekmekler  %59 un, %38 su, %1.5 maya kullanılıyor
    //cicek ekmek beyaz ekmek oz ek olarak % 1 tuz içeriyor ve çiçek seklinde oluyor
    //Somun ekmek beyaz ekmek oz ek olarak %1.5 tuz içeriyor ve ince uzun seklinde oluyor


    @Override
    public void un() {
        System.out.println("Beyaz ekmek % 59 un içerir");
    }

    @Override
    public void su() {
        System.out.println("Beyaz ekmek % 38 su içerir");
    }

    @Override
    public void maya() {
        System.out.println("Beyaz ekmek % 1,5 maya içerir");
    }

    public abstract void sekil();


}
