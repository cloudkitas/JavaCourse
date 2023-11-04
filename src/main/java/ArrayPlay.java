import java.util.Scanner;

public class ArrayPlay {

    static int[] arrayNum;
    static int maxNumber = 4;
    public static void main(String[] args) {
        initializeArray(4);
        printArraySize(arrayNum);
        populateArray();
        printArray();
        int result = calcArraySum(arrayNum);
        System.out.println("The sum of your array is: " + result);
    }

    static void initializeArray(int arrSize){

        arrayNum = new int[arrSize];
        if (arrSize != maxNumber) {
            System.out.println("Invalid Array Size");
        }
    }

    static void populateArray() {
        Scanner input = new Scanner(System.in);
        int j = 0;
        while (j < maxNumber) {
            System.out.println("Enter a Number: ");
            int x = input.nextInt();
            arrayNum[j] = x;
            j ++;
        }

    }

    static void printArraySize(int[] arr) {
        System.out.println(arr.length);
    }

    static void printArray() {
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.println(arrayNum[i]);
        }
    }

    static int calcArraySum(int[] arr) {
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++){
            arrSum = arrSum + arr[i];
        }
        return arrSum;
    }

    // test
}
