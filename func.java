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
        int k=obj.calc(s);
        System.out.println(k);
    }
    public int calc(String s1)
    {
        int l,i,c=0;
        char ch;
        l=s1.length();
        s1=s1.toLowerCase();
        for(i=0;i<l;i++)
        {
            ch=s1.charAt(i);
            
            if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u')
            {
                c++;
            }
        }
        return c;
        
    }
    
}