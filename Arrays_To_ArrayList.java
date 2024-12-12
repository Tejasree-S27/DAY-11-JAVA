import java.util.*;

class Arrays_To_ArrayList 
{
    public static void main(String args[])
    {
        // Declare 'a' as an ArrayList
        ArrayList<Integer> a = new ArrayList<>();  
        a.add(456);
        a.add(876);
        a.add(345);
        a.add(1);
        // Convert ArrayList to Array
        Object[] b = a.toArray(); 
        // Print the array
        System.out.println(Arrays.toString(b));
    }
}
