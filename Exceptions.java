/*
/*import java.io.*;
class Main
{
public static void main(String args[])
{
FileInputStream fx = new FileInputStream("A1.txt");
}
}*/
// Exceptional Handling Arthimetic Exception Example
/*
class Exceptions {
public static void main(String args[]){
int x = 0;
int y = 50/x;
System.out.println("y ="+y);
}
}
*/
// Using the try and catch in Exceptional Handling
/*
class Exceptions
{
public static void main(String args[]) {
try{
int x = 0;
int y = 50/x;
System.out.println("y = "+y);
}
catch(ArithmeticException e){
	System.out.println("Division by zero");
}
System.out.println("After catch statement.");
}
}*/
/*
class Exceptions
{
public static void main(String xyz[])
{
for(int i=0;i<=xyz.length;i++)
{
try{
System.out.println(xyz[i]);
}
catch(ArrayIndexOutOfBoundsException ar){
System.out.println("Array out of BOud Error : Rectify");
}
}
System.out.println("Thank you");
}
}
*/
// catching Multiple Exceptions 
/*
class Exceptions 
{
public static void main(String args[]){
int x = 100;
int y = 0;
System.out.println(args[1]);
int z = x/y;

}
catch(ArrayIndexOutOfBoundsException ar){
System.out.println("Array out of Bounds Error :Rectify");
}
catch(ArthimeticException e){
System.out.println("Divison by zero. ");
}
}*/


// Handling the exception and not terminating the program
class Exceptions{
public static void main(String args[]){
try{
int x = 100;
int y = 0;
System.out.println(args[1]);
int z = x/y;
java
}catch(Exception e)
{
System.out.println("oops");
}
}
}
*/





