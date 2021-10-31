/*class Number {
    int no = 20;
    int addNO(int no)
    {
        this.no = this.no + no;
        return(no);
    }
}
class Main{
    public static void main(String args)
    {
        Number n1 = new Number();
        int res = n1.addNo(10);
        System.out.println(res);
    }
}*/
//this cn be used to call overloaded constructors from another constructor of same class
/*class Sample{
    Sample(){
        System.out.println("default constructor");
    }
    Sample(String str){
        this();
        System.out.println("ONE ARGUMENT CONSTRUCTOR"+ str );
    }
    Sample(String str , int no){
        this(str);
        System.out.println("two arguments constructo "+no);

    }
}
class Main{
    public static void main(String args[])
    {
        Sample a1 = new Sample();
        Sample a2 = new Sample("java") ;
        Sample a3 = new Sample("java",10);

    }
}*/
