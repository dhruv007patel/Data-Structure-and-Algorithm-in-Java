/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Arrays;

/**
 *
 * @author Dhruv Patel
 */
public class Stack {
    int size;
    int stack[];
    int top=-1;
    int itemcount=0;
    Stack(int size)
    {
        this.size=size;
        stack=new int [size];
    }
    Stack()
    {
        this.size=10;
        stack=new int [10];
    }
    
    boolean isEmpty()
    {
        if (top==-1)
            return true;
        else
        return false;
    }
    boolean isFull()
    {
        if(top+1==size)
            return true;
        else
            return false;
    }
    int peek ()
    {
        return stack[top];
    }
    boolean pop()
    {   
        if(!isEmpty())
        {
             top--;
             stack[top+1]=0;
             itemcount--;
             return true;
        }
        else
            return false;
    }
    boolean push(int data)
    {
        if(!isFull())
        {
            top++;
            stack[top]=data;
            itemcount++;
            return true;
        }
        else
            return false;
    }
    @Override
    public String toString()
    {
        return Arrays.toString(stack);
    }   
}
