package stack;
import java.util.*;;
public class _05_under_over_flow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop(); //[] empty
        st.pop(); // error also in peek
    }
    
}
