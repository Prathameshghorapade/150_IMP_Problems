import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int arry[]={1,2,3,4,5,6,9,5};
        int target=8;

        System.out.println("Index :"+Arrays.toString(twoSum(arry,target)));

    }


    public static int[] twoSum(int[] arry,int target){

        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<arry.length;i++){
            int complement=target-arry[i];


            if (map.containsKey(complement)){
             return new int[]{map.get(complement),i};
            }

            map.put(arry[i],i);

        }
        return new int[]{};

    }
}
