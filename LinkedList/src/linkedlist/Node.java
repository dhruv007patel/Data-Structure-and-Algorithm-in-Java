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
public class Node<T> {
        private T data;
        Node<T> next;
        public Node(T data)
        {
            this.data=data;
            next=null;
        }
        public Node(T data,Node<T> next)
        {
            this.data=data;
            this.next=next;
        }
        public void setData(T Data)
        {
            this.data=data;
        }
        public T getData()
        {
            return data;
        }
        public void setNext(Node <T> next)
        {
            this.next=next;
        }
        public Node<T> getNext()
        {
            return next;
        }
}
