package stack;
import java.util.*;
public class _10_next_greater_element {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,2,4};

        int[] res = new int[arr.length];
        // for(int i = 0;i<arr.length;i++){
        //     res[i] = -1;
        //     for(int j = i+1;j<arr.length;j++){
        //         if(arr[j] > arr[i]){
        //             res[i] =  arr[j];
        //             break;
        //         }
                
        //     }
        // }

      
        // time complexity n2 s.c = o(1)
        // o(n) solve stacks
        Stack<Integer> st = new Stack<>();
        int  n= arr.length;
        res[n-1] = -1;
        st.push(arr[n-1]);
        for(int i = n-1 ;i>=0;i--){
            while(st.size()>0 && st.peek()<arr[i]  ){
                st.pop();
            }
            if(st.size() ==0){
                res[i] = -1;
            }
            else{
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        for(int i =0;i<arr.length;i++){
            System.out.println(res[i]);
        }
        

    }
}
