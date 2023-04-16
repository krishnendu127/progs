import java.io.*;
import java.util.*;
class func
{
    
    public static void main()
    {
        func obj=new func();
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        s=sc.nextLine();
        obj.calc(s);
        
    }
    public void calc(String s1)
    {
        int l;
        char ch1,ch2;
        l=s1.length();
        if(l%2==0)
        {
          ch1=s1.charAt((l/2));
          ch2=s1.charAt(((l/2)-1));
          System.out.println(ch1+" "+ch2);
        }
        else
        {
            ch1=s1.charAt(l/2);
            System.out.println(ch1);
        }
        
        
    }
    
}