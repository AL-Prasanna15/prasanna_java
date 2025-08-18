import java.util.Scanner;
public class staticarray {
    static int[] arr = {10, 40, 90, 20, 30, 50};
    static int n = 6;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 6;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Array Operations Menu ---");
            System.out.println("1. Array linear Searching");
            System.out.println("2. Array binary Searching");
            System.out.println("3. Array bubbleSorting");
            System.out.println("4.Exit from programm");
            System.out.print("please enter your valid choice:");
            int choice;
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    linearsearching();
                    break;
                case 2:
                    binarysearch();
                    break;
                case 3:
                    bubblesorting();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void linearsearching() {
        int key, i;
        boolean found = false;
        System.out.print("Enter a key value: ");
        key = sc.nextInt();
        for (i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("The key element is found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }

    static void binarysearch() {
        int[] array={10,20,30,40,50,60};
        int l = 0;
        int h = n - 1;
        int key;
        boolean found=false;
        System.out.print("please enter a key value:");
        key = sc.nextInt();
        while (l <= h) {
            int mid = (l + h) / 2;
            if (array[mid] == key) {
                System.out.println("searching element is found at index :" + mid);
                found=true;
                break;
            } else if (array[mid] < key) {
                l= mid + 1;
            } else {
                h = mid - 1;
            }
        }
        if(!found) {
            System.out.println("Element not found in the array.");
        }

    }

    static void bubblesorting() {
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
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}






