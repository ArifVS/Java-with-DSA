import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Is Password Correct? (true/false): ");
        boolean isPassWordCorrect = sc.nextBoolean();
       
        System.out.print("Is Face Recognized correct? (true/false): ");
        boolean isFaceCorrect = sc.nextBoolean();
        
        System.out.print("Is Admin Approved? (true/false): ");
        boolean isAdminApproved = sc.nextBoolean();
        
        if(isFaceCorrect && isFaceCorrect && isAdminApproved){
            System.out.println("Open Door");
        }
        else{
            System.out.println("Access Denied");
        }
    }
}
