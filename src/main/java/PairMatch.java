import java.util.Scanner;

public class PairMatch {


    public static void main(String[] args) {
     //   System.out.println("What's your name");
      //  Scanner input = new Scanner(System.in);
       // String name = input.nextLine();
        //System.out.println("Hello " + name);
            putNumbersInArray();
            calcArraySum(arrNum);
    }

    static int[] arrNum = new int[4];

    static void putNumbersInArray() {
        int maxNums = 4;
        //int[] arrNum = new int[4];
     //   System.out.println("Enter the number");
       // Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < maxNums) {
            System.out.println("Enter a number");
            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            arrNum[i] = x;
            i ++;
        }

        for (int j = 0; j < arrNum.length; j ++){
            int arrSum = 0;
            System.out.println(arrNum[j]);
        }


    }
    static void calcArraySum(int[] nums) {
        int arrSum = 0;
        for (int i = 0; i < nums.length; i ++) {
            arrSum = arrSum + nums[i];
        }
        System.out.println(arrSum);

    }


}
