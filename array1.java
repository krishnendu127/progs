import java.util.*;
import java.io.*;
class array
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,t;
        System.out.println("enter size");
        int n=sc.nextInt();
        System.out.println("enter term");
        int k=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                t=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=t;
            }
        }
        System.out.println(arr[k-1]);
    }
}