package java_training;

import java.util.Stack;

public class stackvalidparenthesis {
    static int count(String str){
        int size= 0;
        Stack<Character> st = new Stack<>();

        int n= str.length();

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='{'|| ch=='[' || ch=='('){
                st.push(ch);
            }
            else {
                char top = st.peek();
                if((ch == '}' && top=='{')||(ch == ']' && top=='[')||(ch == ')' && top=='(')){
                    st.pop();
                }
            }
        }

        size = st.size();
        return size;
    }
    static boolean isValid(String str){
        Stack<Character> st = new Stack<>();

        int n= str.length();

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='{'|| ch=='[' || ch=='('){
                st.push(ch);
            }
            else {
                if(st.isEmpty()){
                    return false;
                }
                else {
                    char top = st.pop();
                    if ((ch == '}' && top != '{') || (ch == ']' && top != '[') || (ch == ')' && top != '(')) {
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String ch = "()}[]";

        if(isValid(ch)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
