import java.io.*;
public class TestClassInheritance{
    public static void main(String args[])throws IOException
    {
        Test obj1= new Test();
        obj1.a=-1;
        Test obj2=obj1.clone();
        obj2.a=2;
        System.out.println("obj1.a= "+obj1.a+"    obj2.a= "+obj2.a);


    }


}
class Test 
{
    int a;
    Test(){a=0;}
    
    public Test clone()
    {
        Test obj=new Test();
        obj.a=a;
        return obj;
        
    }

}