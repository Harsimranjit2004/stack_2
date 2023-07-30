package stack;
import java.util.*;;
public class _03_print {
    public static void displayrev(Stack<Integer> st){
        // permenant change
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayrev(st);
        // 
        // Stack<Integer> rt = new Stack<>();
        // while(st.size()>0){
        //     rt.push(st.pop());
        // }
        // while(rt.size()>0){
        //     int x = rt.pop();
        //     System.out.println(x);
        //     st.push(x);
        // }
        int n  = st.size();
        int[] arr = new int[n];
        for(int i=n-1;i>=0;i--){
            int x = st.pop();
            arr[i] = x;
        }
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
            st.push(arr[i]);
        }
// recursive reverse
     
    }
    public static void displayRecr(Stack<Integer> st){
        if(st.size() ==0) return;
        int top = st.pop();
        System.out.println(top);
        displayRecr(st);
        st.push(top);
    }
    public static void displayreve(Stack<Integer> st){
        if(st.size() ==0) return;
        int top = st.pop();
        displayreve(st);
        System.out.println(top);
        st.push(top);
    }
}
