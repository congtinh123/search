package src;

import java.util.Random;
import java.util.Scanner;

public class Bt9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Nhập kích thước mảng
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        // Tạo mảng ngẫu nhiên
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(1000); // Số ngẫu nhiên từ 0 đến 999
        }

        // Sao chép mảng để so sánh
        int[] arrayForBubbleSort = array.clone();
        int[] arrayForSelectionSort = array.clone();
        int[] arrayForInsertionSort = array.clone();

        // So sánh thời gian thực thi
        long startTime, endTime;

        // Bubble Sort
        startTime = System.nanoTime();
        bubbleSort(arrayForBubbleSort);
        endTime = System.nanoTime();
        System.out.println("Thời gian thực thi Bubble Sort: " + (endTime - startTime) + " nanoseconds");

        // Selection Sort
        startTime = System.nanoTime();
        selectionSort(arrayForSelectionSort);
        endTime = System.nanoTime();
        System.out.println("Thời gian thực thi Selection Sort: " + (endTime - startTime) + " nanoseconds");

        // Insertion Sort
        startTime = System.nanoTime();
        insertionSort(arrayForInsertionSort);
        endTime = System.nanoTime();
        System.out.println("Thời gian thực thi Insertion Sort: " + (endTime - startTime) + " nanoseconds");

        scanner.close();
    }

    // Hàm sắp xếp bằng Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Hoán đổi array[j] và array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Hàm sắp xếp bằng Selection Sort
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi array[i] và array[minIndex]
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    // Hàm sắp xếp bằng Insertion Sort
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            // Di chuyển các phần tử lớn hơn key lên một vị trí
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
