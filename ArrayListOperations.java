import java.util.*;
class ArrayListOperations 
{
    public static void main(String args[])
    {
        ArrayList<Integer> b=new ArrayList<>();
        b.add(645);
        b.add(467);
        b.add(878);
        System.out.println(b);
        //for removing a element
        b.remove(2);
        System.out.println(b);
        //to clear a ArrayList
        b.clear();
        System.out.println(b);
    }
}