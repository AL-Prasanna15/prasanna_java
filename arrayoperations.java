import java.util.Scanner;
public class arrayoperations {
    static int[] arr;
    static int n;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter size of array: ");
        n = sc.nextInt();
        arr = new int[100];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        while (true) {
            System.out.println("\n--- Array Operations Menu ---");
            System.out.println("1. Array Accessing");
            System.out.println("2. Array Insertion");
            System.out.println("3. Array Deletion");
            System.out.println("4. Array Searching");
            System.out.println("5. Array Sorting");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    accessingElement();
                    break;
                case 2:
                    insertion();
                    break;
                case 3:
                    deletion();
                    break;
                case 4:
                    searching();
                    break;
                case 5:
                    sorting();
                    break;
                default:
                    System.out.println("Invalid choice.");
                    System.exit(0);
            }
        }
    }

    static void accessingElement() {
        System.out.print("Enter index to access: ");
        int index = sc.nextInt();
        if (index >= 0 && index < n) {
            System.out.println("Element at index " + index + ": " + arr[index]);
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    static void insertion() {
        if (n >= arr.length) {
            System.out.println("Array is full. Cannot insert.");
            return;
        }

        System.out.print("Enter element to insert at beginning: ");
        int newElement = sc.nextInt();

        for (int i = n; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = newElement;
        n++;
        System.out.println("Array after insertion:");
        displayArray();
    }

    static void deletion() {
        if (n == 0) {
            System.out.println("Array is empty. Cannot delete.");
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;

        System.out.println("Array after deletion:");
        displayArray();
    }

    static void searching() {
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
    }

    static void sorting() {
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Array after sorting (descending):");
        displayArray();
    }

    static void displayArray() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
