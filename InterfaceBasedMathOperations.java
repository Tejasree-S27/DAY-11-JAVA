import java.util.*;
interface math
{
    public int operation(int a,int b);
}
class InterfaceBasedMathOperations 
{
    public static void main(String args[])
    {
        math add=(a,b)->a+b;
        math sub=(a,b)->a-b;
        //printing addition operation
        System.out.println(add.operation(4,5));
        //printing substraction operation
        System.out.println(sub.operation(10,7));
    }
}