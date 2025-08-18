import java.util.Scanner;

public class roman {
    static int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int num = 0;
            switch (c) {
                case 'I':num= 1; break;
                case 'V':num= 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C':num = 100; break;
                case 'D': num = 500; break;
                case 'M':num = 1000; break;
                default:
                    System.out.println("Invalid Roman numeral character: " + c);
                    return -1;
            }

            if (num < prevValue) {
                total -= num;
            } else {
                total +=num;
            }

            num = num;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = sc.nextLine().toUpperCase();

        int result = romanToInt(roman);
        if (result != -1) {
            System.out.println("Integer value: " + result);
        }
    }
}
