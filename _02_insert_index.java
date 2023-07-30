package stack;

import java.util.*;

public class _02_insert_index {
    public static void InsertRec(Stack<Integer> st, int n){
        if(st.size() == 0){
            st.push(n);
            return;
        }
        int top = st.pop();
        InsertRec(st,n);
        st.push(top);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        int idx  = 2;
        int x = 7;
        // 
        InsertRec(st, x);
        System.out.println(st);
    }
}
