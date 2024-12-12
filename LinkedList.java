import java.util.*;
class LinkedList 
{
    public static void main(String args[])
    {
        LinkedList<Integer> a=new LinkedList<>();
        a.add(456);
        a.add(746);
        a.add(876);
        System.out.println(a);
        a.addFirst(645);
        System.out.println(a);
        a.addLast(575);
        System.out.println(a);

        
    }
}