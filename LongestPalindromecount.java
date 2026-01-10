import java.util.HashMap;
import java.util.Map;

public class LongestPalindromecount {

    public static void main(String[] args) {


        String str="aabaa";

        Map<Character,Integer>frequencyMap=new HashMap<>();

      int result=0;

      int oddCount=0;

      for (char character:str.toCharArray()){
          frequencyMap.put(character,frequencyMap.getOrDefault(character,0)+1);
          int currentFrequency=frequencyMap.get(character);

          if (currentFrequency%2==0){
              result=result+2;
              oddCount--;
          }else {
              oddCount++;
          }

      }

        if (oddCount>0){
            result=result+1;
        }
        System.out.println(result);


    }

}

