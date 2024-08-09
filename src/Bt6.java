package src;

import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Bt6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng đối tượng
        System.out.print("Nhập số lượng đối tượng Person: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng mới

        Person[] people = new Person[n];
        System.out.println("Nhập thông tin các đối tượng (name age):");
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int age = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng mới
            people[i] = new Person(name, age);
        }

        // Sắp xếp mảng đối tượng theo age
        selectionSort(people);

        // Hiển thị danh sách đã sắp xếp
        System.out.println("Danh sách sau khi sắp xếp theo age:");
        for (Person person : people) {
            System.out.println(person);
        }

        scanner.close();
    }

    public static void selectionSort(Person[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j].age < array[minIndex].age) {
                    minIndex = j;
                }
            }
            // Hoán đổi array[i] và array[minIndex]
            Person temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
