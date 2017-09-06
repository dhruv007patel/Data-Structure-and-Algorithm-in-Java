public class Node <T> {
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
