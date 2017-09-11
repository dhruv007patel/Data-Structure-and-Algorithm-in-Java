
import java.util.Arrays;

public class Queue {
    int size;
    int queue[];
    int front=0;
    int rear=-1;
    int itemcount=0;
    
    Queue(int size)
    {
        this.size=size;
        queue=new int[size];       
    }
    Queue()
    {
        this.size=10;
        queue=new int[10];      
    }
    public boolean isFull()
    {
        return itemcount==size;
    }      
    public boolean isEmpty()
    {      
       return itemcount==0;
    }
    public int peek()
    {
       return queue[front];
    }
    public void setSize(int size)
    {
        this.size=size;
        queue=new int [size];
    }
    public int size()
    {
        return itemcount;
    }    
    public boolean insert(int data)
    {
        if(isFull())
            return false;
                  
          if(!isFull())
         {
           if(rear==size-1)
           {
               rear=-1;
               
           }
       }
       queue[++rear]=data;
         itemcount++;
         return true;
   }
   public boolean removeData()
   {
       int data=queue[front++];
       if(itemcount==-1)
       {
           return false;
       }
       if(front==size)
       {
           front=0;
       }
       if(itemcount>=0) 
       {
           queue[itemcount--]=0;
       }   
       return true;
   }
    @Override
    public String toString()
    {
        return Arrays.toString(queue);
    }  
}
