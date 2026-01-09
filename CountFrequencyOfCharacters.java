import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfCharacters {

    public static void main(String[] args) {


        String str="prathamesh";

        Map<Character,Integer>map=new HashMap<>();

        for (char character:str.toCharArray()){
            if (map.containsKey(character)){
                map.put(character,map.get(character)+1);
            }else {
                map.put(character,1);
            }
        }

        System.out.println(map);
    }
}
