import java.util.HashMap;
import java.util.Map;

public class OneStringIsPartOfAnother {
    public static void main(String[] args) {

        String s1="Prathamesh";
        String s2="Mesh";

        System.out.println(isSubString(s1,s2));
    }


    public static boolean isSubString(String s1,String s2){

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        Map<Character,Integer>frequencyMap=new HashMap<>();

        for (char character:s1.toCharArray()){
            frequencyMap.put(character,frequencyMap.getOrDefault(character,0)+1);
        }

        for (char character:s2.toCharArray()){
            if (frequencyMap.containsKey(character) && frequencyMap.get(character)>0){
                frequencyMap.put(character,frequencyMap.getOrDefault(character,0)-1);
            }else {
                return false;
            }
        }

        return true;



    }

}
