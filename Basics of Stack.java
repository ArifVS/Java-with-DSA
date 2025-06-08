import java.util.*;
class Main{
    public static class s{
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> stack = new ArrayList<>();
        
        void push(int value){
            stack.add(value);
            System.out.println(value+" Pushed into stack.");
        }
        
        void pop(){
            if(stack.isEmpty()){
                System.out.println("Stack Underflow");
            }else{
                int removed = stack.remove(stack.size()-1);
                System.out.println(removed+" poped from stack");
            }
        }
        
        void peek(){
            if(stack.isEmpty()){
                System.out.println("stack is empty");
            }else {
                System.out.println("Top element is: "+stack.get(stack.size()-1));
            }
        }
        
        void isEmpty(){
            if(stack.isEmpty()){
                System.out.println("Stack is empty");
            }else{
                System.out.println("Stack is not empty");
            }
        }
        
        
    }
    
    public static void main(String[] args){
        s st = new s();
        st.push(10);
        st.push(20);
        st.peek();
        st.pop();
        st.peek();
        st.isEmpty();
        st.pop();
        st.pop();
        
    }
}
