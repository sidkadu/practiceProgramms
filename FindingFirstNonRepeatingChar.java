import java.util.*;

public class FirstUniqueCharacter {
    
    public char firstUniqueChar(String s)
    {
        // Use a LinkedHashMap to maintain the order of characters
        Map<Character, Integer> map = new LinkedHashMap<>();
        
        // Count the occurrences of each character
        for(char c : s.toCharArray())
        {
            //The method getOrDefault() retrieves the value associated with the key c (the character) from the map.If the key c does not exist in the map (i.e., no value is mapped to it), the method returns the default value specified as the second parameter, which is 0 in this case
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
        // Find the first character with a count of 1
        for(char c : s.toCharArray())
        {
           if (map.get(c) == 1)
               return c;
        }
        
        return'_';
        
    }
    
    public static void main(String[] args) {
        
          // Create an instance of the class
        FirstUniqueCharacter finder = new FirstUniqueCharacter();
        
        // Input string
        String input  = "SWISS";
        
           // Find and print the first non-repeating character
       char result = finder.firstUniqueChar(input);
        System.out.println("The first non-repeating character is :" + result);
         
    }
}
