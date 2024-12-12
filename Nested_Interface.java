interface Out
    {
        void outm();
    interface in{
        void inm();
    }
    }
class Nested_Interface implements Out.in
{
    public void inm()
    {
        System.out.println("Hello i am inner method");
    }
    public static void main(String args[])
    {
        Nested_Interface h=new Nested_Interface();
        h.inm();
    }
}
    