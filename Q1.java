package classobject;
import java.util.Scanner;

import java.util.Arrays;


public class MergeTwoArray{
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        int i = m - 1;
        int j = n - 1;

        for (int k = m - 1; k >= 0; k--) {
            if (X[k] != 0) {
                X[i--] = X[k];
            }
        }

        while (j >= 0) {
            if (i >= 0 && X[i] > Y[j]) {
                X[i + j + 1] = X[i];
                i--;
            } else {
                X[i + j + 1] = Y[j];
                j--;
            }
        }

        // Sort the merged array
        Arrays.sort(X);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of X array: ");
        int sizeX = scanner.nextInt();
        int[] X = new int[sizeX];
        System.out.println("Enter the elements of X separated by space:");
        for (int i = 0; i < sizeX; i++) {
            X[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of Y array: ");
        int sizeY = scanner.nextInt();
        int[] Y = new int[sizeY];
        System.out.println("Enter the elements of Y separated by space:");
        for (int i = 0; i < sizeY; i++) {
            Y[i] = scanner.nextInt();
        }

        mergeArrays(X, Y);

        System.out.println("Merged and sorted array: " + Arrays.toString(X));
    }
}
