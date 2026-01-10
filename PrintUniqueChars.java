import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueChars {

    public static void main(String[] args) {

        String str="abcdabcde";

      Set<Character>uniques=new LinkedHashSet<>();

      for (char character:str.toCharArray()){
      uniques.add(character);
      }

        System.out.println(uniques);
    }
}
