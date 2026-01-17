import java.util.HashMap;
import java.util.Map;

public class OneArrayIsSubSetOFAnother {

    public static void main(String[] args) {

        int arr1[]={1,2,3,4,5,6,7,8,9,10};
        int arr2[]={4,5,6};

        System.out.println(isSubset(arr1,arr2));

    }

    static boolean isSubset(int arr1[],int arr2[]){

        Map<Integer,Integer>frequencyMap=new HashMap<>();

        for (int element:arr1){

            frequencyMap.put(element,frequencyMap.getOrDefault(element,0)+1);

        }

        for (int element:arr2){

            if (frequencyMap.containsKey(element) && frequencyMap.get(element)>0){
                frequencyMap.put(element,frequencyMap.getOrDefault(element,0)-1);
            }else {
                return false;
            }
        }

        return true;

    }
}
