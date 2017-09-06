public class List<T>{
    Node<T> fnode;
    Node<T> lnode;
    String name;
    
    public List()
    {
        name="List";
        fnode=lnode=null;
    }
    public List(String lname)
    {
        name=lname;
        fnode=lnode=null;
    }
    
    public boolean IsEmpty()
    {
        return fnode==null;
    }
    public void Insertfront(T item)
    {
        if(IsEmpty())
        {
            fnode=lnode=new Node<T>(item);
        }
        else
            fnode=lnode=new Node<T>(item,fnode);
    }
    public void Insertback(T item)
    {
        if(IsEmpty())
        {
            fnode=lnode=new Node<T>(item);
        }
        else
        {
           lnode.next=new Node<T>(item);
           lnode=lnode.next;
        }
    }
    public String Print()
    {
        String s;
        if(IsEmpty())
        {
            s="Empty "+name;
            return s;
        }
        else
        {
           s="The" + name + "is : \n\n"; 
        }
        Node<T> temp=fnode;
        while(temp!=null)
        {
            s=s+temp.getData()+"\n";
            temp=temp.getNext();
        }
        s=s+"\n";
        s=s+"End "+name+" \n";
        return s;
    }
    public void removeAll()
    {
        lnode=fnode=null;
    }
    public T removeFromFront()throws EmptyListException
    {
        if(IsEmpty())
        {
            throw new EmptyListException(name);
        }
        T removeItem =fnode.getData();
        if(fnode==lnode) 
            fnode=lnode=null;
        else
            fnode=fnode.getNext();
        return removeItem;
    } 
    public T removeFromBack()throws EmptyListException
    {
        if(IsEmpty())
        {
            throw new EmptyListException(name);
        }
        T removeitem=lnode.getData();
        if(fnode==lnode)
            fnode=lnode=null;
        else
        {
            Node <T> temp=fnode;
            while(temp.getNext()!=lnode)
            {
                temp=temp.getNext();
            }
                lnode=temp;
                temp.setNext(null);
        }
        return removeitem;
    }
    public String searchBrand(String brand)
    {
        String str;
        if(IsEmpty())
        {
            str=" Empty "+name;
            return str;
        }
         
        str="The "+name+ " is : \n\n";
            
        Node<T> temp=fnode; 
        String w;       
        while(temp!=null)
        {
            w=temp.getData().toString();
            String line1=w.substring(0,w.indexOf(":")+1);
            line1=line1.substring(line1.lastIndexOf(":")+1);
            if(line1.equals(brand))
            {
                str=str+temp.getData()+"\n";
            }
            temp=temp.getNext();
        }
        str=str+" \n";
        str=str+"End "+name+ " \n";
        
        return str;
    }
    public String NumOfCar()
    {
        int num=0;
        String str;
        if(IsEmpty())
        {
            str="Empty "+name;
            return str;
        }
        str="The length of "+name+"is : "+"\n";
        Node<T> temp=fnode;
        while(temp!=null)
        {
            num++;
            temp=temp.getNext();
        }
        str=str+num;
        return str;
    }
    public String printNode(int n)
    {
        int num=1;    
        String s;
        if(IsEmpty())
        {
            s="Empty "+name;
            return s;
        }
        s="The Node is "+":\n\n";
        Node<T> temp=fnode;
        while(temp!=null)
        {
            if(num==n)
                s=s+temp.getData()+"\n";
            num++;
            temp=temp.getNext();
        }   
        return s;
    }
    public boolean deleteNode(int n)
    {
          int num=1;
          String s;
          if(IsEmpty())
              return false;
          Node<T> temp=fnode;
          Node<T> prev=fnode;
          if(n==1)
          {    fnode=temp.next;
               return true;
          }
          while(temp!=null)
          {
              if(num==n)
              {
                  prev.next=temp.next;
                  return true;
              }
              prev=temp;
              temp=temp.getNext();
              num++;
          }
          return true;
    }
    
    
}
