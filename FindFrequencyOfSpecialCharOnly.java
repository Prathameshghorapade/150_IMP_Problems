import java.util.HashMap;
import java.util.Map;


public class FindFrequencyOfSpecialCharOnly {
    public static void main(String[] args) {

        String str="pr@th@me$h";

        Map<Character,Integer>frequency=new HashMap<>();

        for (char character:str.toCharArray()){

            if (!(character>='a' && character<='z') || (character>='A'&& character<='Z') || (character>=0&&character<=9) || character==' ') {

                if (frequency.containsKey(character)){
                    frequency.put(character,frequency.getOrDefault(character,0)+1);
                }else {
                    frequency.put(character,1);
                }

            }

        }


        System.out.println(frequency);
    }




}
