import java.io.*;
class Ex1
{
    public static void main(String args[])
    {
        try 
            {
                throw new FileNotFoundException(); // to raise an exception intenionally we use throw statemwnt
               
            }
        catch (Exception e) {
            //TODO: handle exception
            System.out.println("Handled in Main");
        }
        System.out.println("in main");
    }
}
//note:  after throw there shall be no statements 
