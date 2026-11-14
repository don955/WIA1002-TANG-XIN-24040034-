import java.util.Random;
import java.util.Scanner;

public class L5Q5 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(101); 
        }

        System.out.println("A list of 20 random integer within 0 to 100");
        printArray(arr);

   
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Array in descending order");
        printArray(arr);

        System.out.print("Enter a number to search: ");
        int target = sc.nextInt();

       
        int linearLoops = 0;
        boolean linearFound = false;
        for (int i = 0; i < arr.length; i++) {
            linearLoops++;
            if (arr[i] == target) {
                linearFound = true;
                break;
            }
        }

        if (linearFound) {
            System.out.println(target + " found");
        } else {
            System.out.println(target + " not found");
        }
        System.out.println("Linear Search - " + linearLoops + " loop(s)");

      
        int binaryLoops = 0;
        boolean binaryFound = false;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            binaryLoops++;
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                binaryFound = true;
                break;
            } else if (arr[mid] < target) {

                high = mid - 1;
            } else {
                
                low = mid + 1;
            }
        }

        if (binaryFound) {
            System.out.println(target + " found");
        } else {
            System.out.println(target + " not found");
        }
        System.out.println("Binary Search - " + binaryLoops + " loop(s)");
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}