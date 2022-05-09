

import java.io.*;

public class reverseRecursion {
    public static String reverse_sentence(String str)
    {
      
        if (str.isEmpty())
          
            return str;
        else {
            
       
            char ch = str.charAt(0);
    
            return reverse_sentence(str.substring(1)) + ch;
        }
    }
  
    public static void main(String[] args)
    {
        String str = "Sudipta";
   
        String rev_str = reverse_sentence(str);
  
        System.out.println(
            "Sentence in reversed form is :  " + rev_str);
  
    
        String str2 = "java";
        
        String rev_str2 = reverse_sentence(str2);
        
        System.out.println(
            "Sentence in reversed form is :  " + rev_str2);
    }
}