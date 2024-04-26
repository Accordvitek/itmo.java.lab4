package lab4.part2;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        showArrayElements();
    }

    private static void showArrayElements() {
        System.out.print("Array length: ");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();

        System.out.println("Numbers of array:");
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Result: " + Arrays.toString(arr));
    }
}
