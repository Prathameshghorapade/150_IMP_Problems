import java.util.HashSet;
import java.util.Set;


public class Duplicate {

    public static void main(String[] args) {

        int arry[] = {1, 2, 3};

        Set<Integer>set=new HashSet<>();

        boolean isContainsDuplicate=false;

        for (int i = 0; i <arry.length ; i++) {

            if (set.contains(arry[i])){
                isContainsDuplicate=true;
            }else {
                set.add(arry[i]);
            }
        }

        System.out.println("Is Array Contais Duplicate Elements :"+isContainsDuplicate);

    }
}