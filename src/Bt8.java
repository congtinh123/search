package src;

import java.util.Scanner;

public class Bt8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập mảng các chuỗi
        System.out.print("Nhập số lượng chuỗi: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng mới

        String[] array = new String[n];
        System.out.println("Nhập các chuỗi:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }

        // Sắp xếp mảng các chuỗi bằng Insertion Sort
        insertionSort(array);

        // Hiển thị mảng đã sắp xếp
        System.out.println("Mảng sau khi sắp xếp:");
        for (String str : array) {
            System.out.println(str);
        }

        scanner.close();
    }

    public static void insertionSort(String[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            String key = array[i];
            int j = i - 1;

            // Di chuyển các chuỗi lớn hơn key lên một vị trí
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
