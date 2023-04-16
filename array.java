import java.io.*;
import java.util.*;
class array
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,pos=0,neg=0,j=0,k=0;
        System.out.println("enter size");
        n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]>=0)
            pos++;
            else
            neg++;
        }
        int posarr[]=new int[pos];
        int negarr[]=new int[neg];
        for(i=0;i<n;i++)
        {
            if(arr[i]>0)
            posarr[j++]=arr[i];
            else
            negarr[k++]=arr[i];
        }
        for(i=0;i<pos;i++)
        System.out.println(posarr[i]);
        for(i=0;i<neg;i++)
        System.out.println(negarr[i]);
    }
}