package src;

import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập mảng đã được sắp xếp
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập các phần tử của mảng (đã sắp xếp):");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Nhập số nguyên cần tìm
        System.out.print("Nhập số nguyên cần tìm: ");
        int target = scanner.nextInt();

        // Thực hiện tìm kiếm nhị phân
        int index = binarySearch(array, target);

        // Hiển thị kết quả
        if (index != -1) {
            System.out.println("Phần tử " + target + " được tìm thấy tại chỉ số: " + index);
        } else {
            System.out.println("Phần tử " + target + " không có trong mảng.");
        }

        scanner.close();
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
