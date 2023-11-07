import java.util.Scanner;

public class ArraySorter2 {


    static int maxArrSize = 5;
    static int[] fillInArray() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int[] arr = new int[maxArrSize];

        while (i < maxArrSize) {
            System.out.println("Enter a number: ");
            int x = scanner.nextInt();
            arr[i] = x;
            i ++;
        }
        return arr;
    }

    static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j ++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }

    static void printArray(int[] arr) {
        for (int i : arr){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = fillInArray();
        sortArray(arr1);
        printArray(arr1);
    }
}
