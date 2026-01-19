import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOFSubsetWithDistinctEle {

    public static void main(String[] args) {

        // set1: 2,1,4
        //set2: 1,6,5
        //set3: 5

        int[]array={2,1,4,1,6,5,5,5};

        System.out.println(findMinNumberOfSubSet(array));

    }

    public static int findMinNumberOfSubSet(int[]array){

        int maxFrequency=0;

        Map<Integer,Integer>frequencyMap=new HashMap<>();

        for (int i = 0; i <array.length ; i++) {

            frequencyMap.put(array[i],frequencyMap.getOrDefault(array[i],0)+1);
            maxFrequency=Math.max(maxFrequency,frequencyMap.get(array[i]));

        }
        return maxFrequency;


    }
}
