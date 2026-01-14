package LinearSearch;

public class FindTargetEleement {
    public static void main(String[] args) {

        int []array={10,20,30,40,50,60,70,80,90};

        findTarget(array,70);

    }


    public static void findTarget(int[]array,int target){

        int ans=-1;

        for (int i = 0; i <array.length ; i++) {

            if (array[i]==target){
                ans=i;
                break;
            }
        }

        if (ans==-1){
            System.out.println("Element NoT Found");
        }else {
            System.out.println("Element Found At Index :"+ans);
        }

    }

}
