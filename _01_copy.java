package stack;

import java.util.Scanner;
import java.util.Stack;

import javax.sql.rowset.spi.SyncResolver;

public class _01_copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        // int n ;
        // System.out.println("enter the number of elements you want to insert");
        // n = sc.nextInt();
        // System.out.println("enter elements");
        // for(int i = 1; i<=n;i++){
        //     int x = sc.nextInt();
        //     st.push(x);
        // }
        // System.out.println(st);
        // reverse order copy
        Stack<Integer> gt = new Stack<>();
        // while(st.size()>0){
        //     // int x  = st.peek();
        //     // rt.push(x);
        //     // st.pop();
        //     rt.push(rt.pop());
        // }
        while(st.size() > 0){
            gt.push(st.pop());
        }
        Stack<Integer> rt = new Stack<>();
        while(gt.size()> 0 ){
            rt.push(gt.pop());
        }
        System.out.println(rt);
    }
}
