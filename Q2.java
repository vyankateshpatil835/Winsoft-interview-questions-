package classobject;
import java.util.Scanner;

public class SumPath {
    public static int maxSumPath(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        int i = 0, j = 0;
        int maxSum = 0, sumX = 0, sumY = 0;

        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                sumX += X[i];
                i++;
            } else if (X[i] > Y[j]) {
                sumY += Y[j];
                j++;
            } else {
                maxSum += Math.max(sumX, sumY) + X[i];
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
        }

        while (i < m) {
            sumX += X[i++];
        }

        while (j < n) {
            sumY += Y[j++];
        }

        maxSum += Math.max(sumX, sumY);

        return maxSum;
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

        int maxSum = maxSumPath(X, Y);
        System.out.println("The maximum sum path is: " + maxSum);
    }
}