package src;

import java.util.Scanner;

class Student {
    String name;
    double gpa;

    Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return name + " (" + gpa + ")";
    }
}
public class Bt10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng đối tượng Student
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng mới

        Student[] students = new Student[n];
        System.out.println("Nhập thông tin sinh viên (name gpa):");
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double gpa = scanner.nextDouble();
            scanner.nextLine(); // Đọc dòng mới
            students[i] = new Student(name, gpa);
        }

        // Sao chép mảng để sắp xếp với các thuật toán khác nhau
        Student[] studentsForBubbleSort = students.clone();
        Student[] studentsForSelectionSort = students.clone();
        Student[] studentsForInsertionSort = students.clone();

        // Sắp xếp với Bubble Sort
        System.out.println("Sắp xếp với Bubble Sort:");
        BubbleSortWithObjects.bubbleSort(studentsForBubbleSort);
        for (Student student : studentsForBubbleSort) {
            System.out.println(student);
        }

        // Sắp xếp với Selection Sort
        System.out.println("Sắp xếp với Selection Sort:");
        SelectionSortWithObjects.selectionSort(studentsForSelectionSort);
        for (Student student : studentsForSelectionSort) {
            System.out.println(student);
        }

        // Sắp xếp với Insertion Sort
        System.out.println("Sắp xếp với Insertion Sort:");
        InsertionSortForStudents.insertionSort(studentsForInsertionSort);
        for (Student student : studentsForInsertionSort) {
            System.out.println(student);
        }

        scanner.close();
    }
}

class BubbleSortWithObjects {
    public static void bubbleSort(Student[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].gpa > array[j + 1].gpa) {
                    // Hoán đổi array[j] và array[j + 1]
                    Student temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

class SelectionSortWithObjects {
    public static void selectionSort(Student[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j].gpa < array[minIndex].gpa) {
                    minIndex = j;
                }
            }
            // Hoán đổi array[i] và array[minIndex]
            Student temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}

class InsertionSortForStudents {
    public static void insertionSort(Student[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            Student key = array[i];
            int j = i - 1;

            // Di chuyển các sinh viên có gpa lớn hơn key lên một vị trí
            while (j >= 0 && array[j].gpa > key.gpa) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
