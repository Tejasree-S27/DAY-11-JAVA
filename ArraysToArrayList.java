import java.util.*;
class ArraysToArrayList 
{
    public static void main(String args[])
    {
        ArrayList<Integer> b=new ArrayList<>();
        b.add(456);
        b.add(876);
        b.add(345);
        b.add(1);
        int c[]=new int [b.size()];
        for(int i=0;i<b.size();i++)
        c[i]=b.get(i);
        System.out.println(Arrays.toString(c));
    }
}