import java.util.*;
class SortedArrayList
{
    public static void main(String args[])
    {
        ArrayList <Integer> a=new ArrayList<>();
        a.add(45);
        a.add(77);
        a.add(12);
        a.add(87);
        //print elements in sorted order
        Collections.sort(a);
        System.out.println(a);
    }
}