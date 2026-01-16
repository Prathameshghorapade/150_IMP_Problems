//using SET

import java.util.HashSet;
import java.util.Set;

public class LongestPalindromeCount2 {
    public static void main(String[] args) {

        String str = "aabaa";

      Set<Character>set=new HashSet<>();

      int result=0;

      for (char character:str.toCharArray()){
          if (set.contains(character)){
              result=result+2;
              set.remove(character);
          }else {
              set.add(character);
          }
      }

      if (set.size()>0){
          result=result+1;
      }


        System.out.println(result);

    }
}
