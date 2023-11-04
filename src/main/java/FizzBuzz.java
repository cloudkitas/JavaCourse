import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println();
        int[] nums = IntStream.range(1, 11).toArray();
       // for (int i = 0; i < nums.length; i++) {
        // System.out.println(nums[i]);
        //}

        for (int k=0; k < nums.length; k ++) {
            if (nums[k] % 3 == 0){
                System.out.println("Fizz " + nums[k]);
            } else {
                System.out.println(nums[k]);
            }

           // System.out.println(nums[k]);
        }
    }
}
