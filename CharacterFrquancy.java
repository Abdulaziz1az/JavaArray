import java.util.HashMap;

public class CharacterFrquancy {
    public static void main(String []args)
    {
        String text = "programing";
        HashMap<Character,Integer> freq = new HashMap<>();
    
        // Count frquncy of each character
        for(int i = 0; i < text.length(); i++) 
        {
            char c = text.charAt(i);
            freq.put(c, freq.getOrDefault(c,0)+ 1);
        }
        // Find first character with frequency = 1
        for(int i = 0; i < text.length(); i++)
        {
            if(freq.get(text.charAt(i)) == 1)
            {
                System.out.println("First none-repeating character: "+ text.charAt(i));
                break;
            }
        }
    }
}
