package stack;

import java.util.Stack;

public class _00_stack {
   public static void main(String[] args) {
        Stack<Integer> st  = new Stack<>();
        System.out.println(st.isEmpty()); // boolean 
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        //  peek
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("size is " + st.size());
        //1st element but stack is only have one element;
        while(st.size()>1){
            st.pop();

        }
        System.out.println(st.peek());
   }
    
}
