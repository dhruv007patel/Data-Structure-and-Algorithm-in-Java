/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Dhruv Patel
 */
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
        String s=null;
        if(IsEmpty())
        {
            s="Empty"+name;
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
            Node<T> temp=fnode;
            while(temp.getNext()!=lnode)
            {
                temp=temp.getNext();
            }
                lnode=temp;
                temp.setNext(null);
        }
        return removeitem;
    }
}
