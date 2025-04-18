// How do you remove spaces from a string in Java?

import java.util.*;
public class SpaceRemover
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input_String;
        System.out.print("Enter the String with Spaces:");
        input_String = sc.nextLine();
        System.out.println("Original String With Spaces:"+ input_String);
        
        String add="";
        for(int i = 0; i<=input_String.length()-1;i++)
        {
            char space_revemover = input_String.charAt(i);
            if(space_revemover != ' ')
            {
                 add = add+space_revemover;
            }
        }
        System.out.println("The Remove Spaces String is:"+add);
    }
}
