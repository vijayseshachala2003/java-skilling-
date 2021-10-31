public class Exceptional{
    public static void recursivePrint(int num){
        System.out.println("Number:"+num);
    if(num == 0) return;
    else recursivePrint(++num);
    }
    public static void main(String[] args){
        Exceptional.recursivePrint(1);
    }
}