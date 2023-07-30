package stack;
import java.util.*;
public class _16_prefix_evaluation {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<Integer> val = new Stack<>();
        for(int i = str.length()-1;i>=0 ;i--){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii <=57){
                val.push(ascii-8);
            }else{
                int v1= val.pop();
                int v2 = val.pop();
                if(ch  == '-') val.push(v1-v2);
                if(ch  == '+') val.push(v1+v2);
                if(ch  == '*') val.push(v1*v2);
                if(ch  == '/') val.push(v1/v2);
            }
        }
    }
}
