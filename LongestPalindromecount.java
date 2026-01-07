import java.util.HashMap;
import java.util.Map;

public class LongestPalindromecount {

    public static void main(String[] args) {


        String str="aabaa";

        Map<Character,Integer>frequencyMap=new HashMap<>();

        int result=0;
        int oddCount=0;

        for (char charater:str.toCharArray()){

            frequencyMap.put(charater,frequencyMap.getOrDefault(charater,0)+1);

            int currentFrequency=frequencyMap.get(charater);

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
