public class Child extends Parent
{
    int childValue = 20;
    
    public Child()
    {
       super();
    }
 
    @Override
    void init()
    {
       childValue = 30;
    }

    public void test()
    {
        System.out.println(childValue);
    }    
}
