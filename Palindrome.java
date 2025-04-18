// Palindrom or not
import java.util.*;
public class palindrom
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input_string;
        System.out.print("Enter the String:");
        input_string = sc.nextLine();
        String reversed_string = "";
        for(int i = input_string.length()-1;i>=0;i--)
        {
            reversed_string = reversed_string+input_string.charAt(i);
        }
        System.out.println("Original String is:"+input_string);
        System.out.println("Reversed String is:"+reversed_string);
        if(input_string.equalsIgnoreCase(reversed_string))
        {
            System.out.println("The Given string is palindrom");
        }
        else{
            System.out.println("Given String is not a palindrom");
        }
        
    }
}
