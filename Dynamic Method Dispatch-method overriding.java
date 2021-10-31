/*public class A{
    void m1(){
        System.out.println("inside A's m2 method");
    }
}
class B{
    void m1(){
        System.out.println("inside B's m1 method");
    }
}
class C{
    void m1(){
        System.out.println("inside C's m1 method");
    }
}
class Dispatch{
    public static void main(String args[]){
        A a = new A();
        B b = new B();
        C c = new C();
        A ref; // it is creating a refernce variable for the super class
        ref = a; // the refernce variable is assigned to the class A
        ref.m1();
        ref = b;
        ref.m1();
        ref = c;
        ref.m1();

    }
}*/


/* create a class Fruit which has name,taste and size as its attributes , a method  called eat() is created which describes 
the name of the fruit and its taste
Inherit the same in 2 other class apple and orange and override the eat()method to represent each fruit taste */

class Fruit{
    void Orange(){
        System.out.println("the fruits name is orange");
        System.out.println("the taste is sweeter");
    }
    void Apple()
        System.out.println("the fruit name is Apple");
        System.out.println("the taste is bitter");
    }

}