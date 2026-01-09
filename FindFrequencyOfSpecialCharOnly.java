import java.util.HashMap;
import java.util.Map;


public class FindFrequencyOfSpecialCharOnly {
    public static void main(String[] args) {

        String str="pr@th@me$h";

        char strArray[]=str.toCharArray();

        Map<Character,Integer>map=new HashMap<>();

        for (char character:strArray){
            if (!(character >='a' && character<='z') || (character>='A' && character<='Z') || (character>=0 && character<=9) || (character==' ')){

                if (map.containsKey(character)){
                    map.put(character,map.get(character)+1);
                }else {
                    map.put(character,1);
                }

            }
        }

        System.out.println(map);

    }
}
