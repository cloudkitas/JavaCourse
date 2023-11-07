import java.util.Scanner;

public class PairsPlay {

    static int maxArraySize = 5;

    public static void main(String[] args) {
        System.out.println();
        int[] arr1 = fillInArray();
        printArray(arr1);
        int arrSum = calcArraySum(arr1);
        System.out.println("the sum of your array is: " + arrSum);
    }

    static int[] fillInArray() {
        int i = 0;
        int[] arr = new int[maxArraySize];
        while (i < maxArraySize) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Number: ");
            int x = scanner.nextInt();
            arr[i] = x;
            i ++;
        }

        return arr;

    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static int calcArraySum(int[] arr) {
        int arrSum = 0;
        for (int j : arr) {
            arrSum = arrSum + j;
        }

        return arrSum;

    }


}
