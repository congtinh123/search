package src;

import java.util.Scanner;

public class Bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập mảng các số nguyên
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Sắp xếp mảng bằng Bubble Sort và đếm số lần hoán đổi
        int swapCount = bubbleSort(array);

        // Hiển thị mảng đã sắp xếp và số lần hoán đổi
        System.out.println("Mảng sau khi sắp xếp:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Số lần hoán đổi: " + swapCount);

        scanner.close();
    }

    public static int bubbleSort(int[] array) {
        int n = array.length;
        int swapCount = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Hoán đổi array[j] và array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapCount++;
                }
            }
        }
        return swapCount;
    }
}
