import java.util.*;
class CheckArrayListContains  
{
    public static void main(String args[])
    {
        ArrayList<Integer> b = new ArrayList<>();
        b.add(645);
        b.add(467);
        b.add(878);
        // Check if the ArrayList contains the specified elements
        System.out.println(b.contains(645));  
        System.out.println(b.contains(886));  
    }
}
