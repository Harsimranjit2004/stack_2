package stack;

public class _07_implement_using_linkedList {
    public static class Node{ // user defined data type
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class Stack{ // user defined data structur
        private Node head = null;
        private int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        void displayRec(Node h){
            if(h ==  null) return;
            displayRec(h.next);
            System.out.println(h.val);
        }
        void display(){
            displayRec(head);
        }
        void displayrev(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.val);
                temp = temp.next;
            }
        }
        int size(){
            return size;
        }
        int pop(){
            if(head == null){
                System.out.println("stack is empty");
                return -1;
            }
            int top = head.val;
            head = head.next;
            size--;
            return top;
            
        }
        int peek(){
            if(head == null){
                System.out.println("stack is empty");
                return -1;
            }
            return head.val;
        }
        boolean isEmpty(){
            if(size == 0) return true;
            return false;
        }


    }
    public static void main(String[] args) {
        
    }
}
