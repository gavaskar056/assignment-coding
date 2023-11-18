import java.util.*;
import java.io.*;

public class Main {
    public static void isPangram(String s)
    {
        boolean isPangram = true;
        for(char i='a'; i<='z'; i++) 
        { 
            boolean isCharacterPresent = false;
            for(int j=0;j<s.length();j=j+1) 
            {
                char currentCharacter = s.charAt(j);

				 // Convert uppercase letters to lowercase
                if(currentCharacter >= 'A' && currentCharacter <= 'Z')
                {
                    currentCharacter = (char)(currentCharacter+32);  
                }
                if(currentCharacter == i)
                {
                    isCharacterPresent = true;
                    break;
                }
            }

            if(isCharacterPresent == false)
            {
                isPangram = false;
                break;
            }
        }

        if(isPangram == true)
        {
            System.out.print("pangram");    
        }
        else
        {
            System.out.print("not pangram");
        }
    }

    public static void main(String args[]) {

   Scanner input = new Scanner(System.in);

      System.out.print("Enter the string: ");
        String s = input.nextLine();

        isPangram(s);

    }
}
