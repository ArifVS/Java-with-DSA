import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int e = sc.nextInt();
            s.push(e);
        }
        System.out.println("The size of stack is:"+s.size());
        System.out.println("The stack elements are:");
        while(!s.isEmpty()){
            System.out.print(s.pop());
        }
        
    }
}
