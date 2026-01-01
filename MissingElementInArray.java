public class MissingElementInArray {

    public static void main(String[] args) {

        int nums[]={1,2,3,4,6};

      int totalSize=6;

      int totalSum=(totalSize*(totalSize+1))/2;



      int sum=0;

        for (int i = 0; i <nums.length ; i++) {
            sum=sum+nums[i];
        }
    
        int missingNum=totalSum-sum;

        System.out.println("Missing Number is :"+missingNum);



    }


}
