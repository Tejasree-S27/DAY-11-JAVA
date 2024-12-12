import java.util.*;
interface math
{
    public int operation(int a,int b);
}
public class FuntionalInterface
{
    public static void main(String args[])
    {
        math add=(a,b) -> a+b;
        math sub=(a,b) -> a-b;
        System.out.println(add.operation(2,3));
        System.out.println(sub.operation(5,3));
    }
}