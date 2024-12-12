import java.util.*;
abstract interface math
{
    void print();
}
class d implements math
{
    //Overriding
    public void print()
    {
        System.out.println("HELLO");
    }
}
public class Abstract_Interface 
{
    public static void main(String args[])
    {
        d f=new d();
        f.print();
    }
}
