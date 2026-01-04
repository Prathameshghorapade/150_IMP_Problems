import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {

        String str = "madam";

        char [] stringArray=str.toCharArray();

        Map<Character,Integer>map=new HashMap<>();

        for (char charater:stringArray){

            map.put(charater,map.getOrDefault(charater,0)+1);
        }


        for (char charter: map.keySet()){

            System.out.println(charter +" "+map.get(charter));

        }

    }
}
