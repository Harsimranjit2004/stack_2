package stack;
import java.util.*;;
public class _12_min_stack {
    // public static class MinStack{
    //     Stack<Long> st = new Stack<>();
    //     long min;
    //     void push(int val){
    //         long x = (long)val;
    //         if(st.size() == 0){
    //             st.push(x);
    //             min = val;
    //         }
    //         else if(x >= min){
    //             st.push(x);
    //         }
    //         else if(x < min){
    //             st.push(2*x-min);
    //             min = x;
    //         }
            
    //     }
    //     void pop(){
    //         if(st.size() == 0) return;
    //         else if(st.peek()>= min){
    //             st.pop();
    //         }
    //         else if(st.peek() < min){
    //             Long oldMin = 2*min-st.peek();
    //             min = oldMin;
    //             st.pop();
    //         }
    //     }
    //     int  peek(){
    //         if(st.size() == 0){
    //             return -1;
    //         }
                
    //         else if(st.peek() > min){
    //             return st.peek();
    //         }
    //         else if(st.peek() < min){
    //             return min;
    //         }
    //         return 0 ;
            
    //     }
    //     int min(){
    //         if(st.size()==0) return min;
    //         return min;
    //     }
    // }
}
