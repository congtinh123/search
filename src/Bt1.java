package src;

import java.util.Scanner;

public class Bt1 {
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

        // Nhập số nguyên cần tìm
        System.out.print("Nhập số nguyên cần tìm: ");
        int target = scanner.nextInt();

        // Thực hiện tìm kiếm tuyến tính
        int index = linearSearch(array, target);

        // Hiển thị kết quả
        if (index != -1) {
            System.out.println("Phần tử " + target + " được tìm thấy tại chỉ số: " + index);
        } else {
            System.out.println("Phần tử " + target + " không có trong mảng.");
        }

        scanner.close();
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
