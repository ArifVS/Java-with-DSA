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
        System.out.println("The top of the element is:"+s.peek());
        
        
        System.out.println("Element to search:");
        int n1 = sc.nextInt();
        
        for (int i = 0; i < s.size(); i++) {
            if (s.search(n1) != -1) {
                System.out.println("Element is found at position from top: " + s.search(n1));
                break;
            } else {
                System.out.println("Element is not found");
                break;
            }
        }
        System.out.println("The stack elements are:");
        while(!s.isEmpty()){
            System.out.print(s.pop());
        }
    }
}
