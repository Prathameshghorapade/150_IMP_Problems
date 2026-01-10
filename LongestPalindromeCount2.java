//using SET

import java.util.HashSet;
import java.util.Set;

public class LongestPalindromeCount2 {
    public static void main(String[] args) {

        String str = "aabaa";

        Set<Character> freqeuncySet = new HashSet<>();

        int result=0;

        for (char character:str.toCharArray()){
            if (freqeuncySet.contains(character)){

                result=result+2;
                freqeuncySet.remove(character);
            }else {
                freqeuncySet.add(character);
            }
        }

        if (freqeuncySet.size()>0){
            result=result+1;
        }

        System.out.println(result);



    }
}
