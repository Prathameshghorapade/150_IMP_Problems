import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {

        String str = "madam";

        Map<Character,Integer>frequency=new HashMap<>();

        for (char character:str.toCharArray()){
            if (frequency.containsKey(character)){
                frequency.put(character,frequency.getOrDefault(character,0)+1);
            }else {
                frequency.put(character,1);
            }
        }

        System.out.println(frequency);



    }
}
