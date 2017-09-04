import java.util.Arrays;
public class Search {
    int a[];
    void intializeArray(int n)
    {
        a = new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=i*i;
        }
    }
    String printArray()
    {
        return "Array : "+ Arrays.toString(a);
    }
    String Serial_Search(int n)
    {
        int flag=0;
        String str;
        long start=System.nanoTime();
        for(int i=0;a.length-1>i;i++)
        {
            if(n==a[i])
            {
                flag=1;
                break;
            }
        }
        long e=System.nanoTime()-start;
        if(flag==1)
        {
            str="Number Found";
        }
        else
        {
            str="Number not Found";
        }
        return str+"\n Time taken to complete this function :"+e+"nano seconds";       
    }
    String binarySearch(int n)
    {
        int flag=0;
        int L,R,M;
        String str;
        L=0;
        R=a.length-1;
        long start = System.nanoTime();
        while(L<=R)
        {
            M=(L+R)/2;
            if(a[M]==n)
            {
                flag=1;
                L=R+1;
            }
            else if(a[M]>n)
                R=M-1;
            else
                L=M+1;           
            
        }
    long e=System.nanoTime()-start;
    if(flag==1)
    {
        str="The no. was found";
    }
    else
    {
        str="The no. not found";
    }
        return str+"\n Time taken to complete this function :"+e+"nano seconds";
  }
}
    
