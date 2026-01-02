import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {

        String str="madam";

        char array[]=str.toCharArray();

        Map<Character,Integer>map=new HashMap<>();

        for (char character:array){

            map.put(character,map.getOrDefault(character,0)+1);
        }

        for (char x: map.keySet()){
            System.out.println(x+"  "+map.get(x));
        }



    }
}
