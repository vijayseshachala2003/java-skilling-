/*encalsulation in java is a mechanism of wrapping the data and code acting onthe data together as a single unit 
it is also called data hiding it can be only accessed by methods of same class not from the putside*/



/*Access specifier : it controls access to class members 
we have two types of access specifiers like private and public */
 
/*class First
{
    private int a = 10;
    void disp()
    {
        System.out.println(a);
    }
    int geta()
    {
        return a;
    }
}
class Main
{
    public static void main(String args[])
    {
        First fob = new First();
        System.out.println(fob.geta());
        fob.disp();
        //System.out.println(fob.a);//it cannot be complied because it is private

    }
}

//Another Example
class First
{
    private int a = 10;
    public int b = 20;
    void disp()
    {
        System.out.println(a);
    }
    int geta()
    {
        return a;
    }
}
class Main
{
    public static void main(String args[])
    {
        First fob = new First();
        System.out.println(fob.geta());
        System.out.println(fob.b);
        fob.disp();
        //System.out.println(fob.a);//it cannot be complied because it is private

    }
}*/
// to modify the private variable
/*
class First{
    private int a = 10;
    public int b = 20;
    int sum()
    {
        return a + b;

    }
    int geta()
    {
        return a ;
    }
    void seta(int val){
        a = val;
    }

}
class Main{
    public static void main(String args[])
    {
        First fob = new First();
        System.out.println(fob.sum());
        System.out.println("changing the value of a as 35");
        fob.seta(35);
        System.out.println(fob.sum());
    }
}*/

/*
class  Point{
    int m_x,m_y;
    public Point(int x , int y){ // constructor 
        m_x = x;
        m_y = y;
    }
    public static void main(String args[])
    {
        Point p = new Point(35,53);
    
    }
} */

