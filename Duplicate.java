import java.util.HashSet;
import java.util.Set;


public class Duplicate {

    public static void main(String[] args) {

      int arry[]={1,2,3,4};


        System.out.println(isDuplicate(arry));


    }

    public static boolean isDuplicate(int arry[]){

        Set<Integer>hashSet=new HashSet<>();

        for (int i=0;i< arry.length;i++){
            if (hashSet.contains(arry[i])){
                return true;

            }else {
                hashSet.add(arry[i]);
            }
        }

        return false;

    }

}