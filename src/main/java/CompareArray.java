import java.util.Scanner;

public class CompareArray {

    // prompt user to input 5 numbers x 2
    // 2nd array missing a number
    // create compare array method



    static int maxArrSize = 5;


    static int[] setArray() {
        System.out.println("Array Initialization - max numbers: " + maxArrSize);
        int i = 0;
        int[] arr1 = new int[maxArrSize];
        while (i < maxArrSize) {
            System.out.println("Enter number ");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            arr1[i] = x;
            i ++;
        }
        System.out.println("Array is set");

        return arr1;

    }

    static void printArray(int[] arr) {
        for (int i=0; i < arr.length ; i ++){
            System.out.println(arr[i]);
        }
    }

    static int calcArrySum(int[] arr) {
        int arrSum = 0;
        for (int i = 0; i < arr.length; i ++ ){
            arrSum = arrSum + arr[i];
        }
        return arrSum;
    }

    static int getMissingValue(int a, int b) {
        int missingValue = a - b;
        return missingValue;
    }

    public static void main(String[] args) {
        System.out.println();
        int[] arr1 = setArray();
        printArray(arr1);
        int[] arr2 = setArray();
        printArray(arr2);
        int sumArr1 = calcArrySum(arr1);
        int sumArr2 = calcArrySum(arr2);
        int missingVal = getMissingValue(sumArr1, sumArr2);
        System.out.println("The missing Value is " + missingVal);
    }



}
