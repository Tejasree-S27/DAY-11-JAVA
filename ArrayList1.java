import java.util.*;
class ArrayList1
{
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        //adding at particular index
        a.add(1,12);
        //modifying
        a.set(2,3421);
        System.out.println(a);
    }
}