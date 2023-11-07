import java.util.Scanner;

public class ArrayPro {

    static int maxArraySize = 5;
    public static void main(String[] args) {
        int[] arr1 = fillInArray();
        int[] arr2 = fillInArray();

        int arr1Sum = calcArraySum(arr1);
        int arr2Sum = calcArraySum(arr2);

        System.out.println("The sum of arr1 is: " + arr1Sum);
        System.out.println("The sum of arr2 is: " + arr2Sum);

        int missingVal = calcMissingValue(arr1Sum, arr2Sum);
        System.out.println("The missing value is " + missingVal);
    }


    static int[] fillInArray() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int[] arr = new int[maxArraySize];
        while  (i < maxArraySize) {
            System.out.println("Enter Number: ");
            int x = scanner.nextInt();
            arr[i] = x;
            i ++;
        }

        System.out.println("Array is now ready");
        return arr;

    }

    static void printArray(int[] arr) {
        for (int j : arr){
            System.out.println(j);
        }
    }

    static int calcArraySum(int[] arr) {
        int arrSum = 0;
        for (int i : arr){
            arrSum = arrSum + i;
        }
        return arrSum;
    }

    static int calcMissingValue(int a, int b){
        return a - b;
    }


}
