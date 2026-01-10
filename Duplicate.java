import java.util.HashSet;
import java.util.Set;


public class Duplicate {

    public static void main(String[] args) {

        int arry[] = {1, 2, 3,3};

        boolean isDuplicate=false;

        Set<Integer>set=new HashSet<>();


        for (int i = 0; i <arry.length ; i++) {
            if (set.contains(arry[i])){
                isDuplicate=true;
            }else {
                set.add(arry[i]);
            }
        }

        System.out.println(isDuplicate);


    }
}