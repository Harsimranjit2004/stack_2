package stack;
import java.util.*;
public class _04_reverse {
    public static void pushAtBottom(Stack<Integer> st, int n){
        if(st.size() ==0){
            st.push(n);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,n);
        st.push(top);
    }
    public static void reverse(Stack<Integer> st){
        if(st.size()==1){
            return;
        }
        int top = st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        reverse(st);
        System.out.println(st);

    }
}
