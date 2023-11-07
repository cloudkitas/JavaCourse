import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArraySorter {


    static int maxArrSize = 5;
    // create a program that receives an arraylist and sorts it


    //fill in array
    static ArrayList<Integer> fillInArray() {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < maxArrSize) {
            System.out.println("Enter a number: ");
            int x = scanner.nextInt();
            arr.add(x);
            i ++;
        }

        return arr;
    }

    //sort array
    static void sortArray(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i ++){
            for (int j = i + 1; j < arr.size(); j ++) {
                if (arr.get(i) > arr.get(j)) {
                   int t = arr.get(i);
                    Collections.swap(arr, i, j);
                    Collections.swap(arr, j, t);
                }
            }
        }
    }

    static void printArray(ArrayList<Integer> arr) {
        for (int i : arr){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.println();
        ArrayList<Integer> arr = fillInArray();
        sortArray(arr);
        printArray(arr);

    }
}
