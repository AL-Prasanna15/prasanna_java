import java.util.Scanner;
class calci {
    public void login() {
        System.out.println("hello prasanna please enter your credentials");
        Scanner sc = new Scanner(System.in);
        String username = "prasanna15";
        String password = "prasanna15";
        System.out.printf("Enter your username:");
        String username1 = sc.nextLine();
        System.out.printf("Enter password:");
        String password1 = sc.nextLine();
        if (username.equals(username1) && password.equals(password1)) {
            System.out.println("hello" + username + "welcome to basic calculator");
        } else {
            System.out.println("username and password are not match");
            login();
            System.exit(0);
        }
        System.out.println("please choose valid option\n addition +\nsubstraction -\nmultiplication*\ndivision /");
        char operator = sc.next().charAt(0);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        int c;
        switch (operator) {
            case '+':
                c = a + b;
                System.out.println("addition" + c);
                break;
            case '-':
                c = a - b;
                System.out.println("substraction" + c);
                break;
            case '*':
                c = a * b;
                System.out.println("multiplication" + c);
                break;
            case '/':
                c = a / b;
                System.out.println("division" + c);
                break;
            case '%':
                c = a % b;
                System.out.println("modulo" + c);
                break;
            case 'E':
                System.exit(0);
                break;
            default:
                System.out.println("please enter number between 1 to 5");
        }
    }
}
public class calculator {
    public static void main(String[] args) {
        calci l = new calci();
        l.login();
    }
}

