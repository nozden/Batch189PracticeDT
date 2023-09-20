package practice06.superthis;

public class Child extends Parent{

    public Child(){
        super();//default olarak her constructorda vardır
        System.out.println("Child class parametresiz constructor");
    }

    public Child(int a){
        System.out.println("Child class tek parametreli constructor");
    }

    public Child(int a, int b){
        super(2,5);
        System.out.println("Child class iki parametreli constructor");
    }

    public static void main(String[] args) {

        //Child obj1=new Child();
        //Child obj2=new Child(1);
        Child obj3=new Child(1,2);


    }


}
