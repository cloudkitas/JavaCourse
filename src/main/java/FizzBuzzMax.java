import java.util.ArrayList;
import java.util.stream.IntStream;

public class FizzBuzzMax {

    static int[] nums = IntStream.range(1,101).toArray();

    public static void main(String[] args) {
        System.out.println();
        //printNums();
        ArrayList<Integer> fb = fillInArr();
        printFizzBuzzNums(fb);
    }

    static void printNums() {
        for (int i : nums){
            System.out.println(i);
        }
    }

    static ArrayList<Integer> fillInArr() {
        ArrayList<Integer> fizzBuzzNums = new ArrayList<>();
        for (int i : nums) {
            if ((i % 3 == 0 ) && (i % 5 == 0)) {
                fizzBuzzNums.add(i);

            } else if (i % 3 == 0) {
                System.out.println("Fizz " + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz " + i);
            } else {
                System.out.println(i);
            }

        }

        return fizzBuzzNums;
    }

    static void printFizzBuzzNums(ArrayList<Integer> arr) {
        for (int i : arr){
            System.out.println(i);
        }
    }
}
