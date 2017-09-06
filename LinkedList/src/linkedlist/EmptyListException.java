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
public class EmptyListException extends Exception{
    public EmptyListException()
    {
        super("List");
    }
    public EmptyListException(String name)
    {
        super(name+" is empty");
    }
    
}
