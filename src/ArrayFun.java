import java.util.Arrays;

public class ArrayFun {

    public static void main(String[] args) {
        //declare an empty double array of size 6
        double[] scores = new double[6];

        //declare an array of 10 ints

        int[] nums = {74,12,48,58,97,47,38,62,3,81};
                    //0  1  2  3  4  5  6  7  8  9
        //how are these elements organized?

        //getting a value
        int fifthElement = nums[4]; //index is one less than the spot you want
        System.out.println(fifthElement);
        //replacing a value
        nums[8] = 33;
        System.out.println(nums[8]);
        //getting the length of an array
        System.out.println("The length of nums is " + nums.length); // no parenthesis after length for arrays

        ///////////////traversing arrays/////////////////

        //printing all the values in an array

        //while loop
        int j = 0;
        while(j < nums.length){
            System.out.println(nums[j]);
            j++;
        }
        System.out.println();

        //for loop
        for(int i = 0; i<nums.length; i++){
            System.out.println(nums[i]);
        }

        //find and print the index (location) of the value 47
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 47){
                System.out.println(i);
            }
        }

        //find and print the max value in nums
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println("The maximum value in nums is " + max);
    }
}
