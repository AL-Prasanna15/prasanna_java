import java.util.Scanner;
public class neon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter a number:");
        int a;
        a=sc.nextInt();
        int b=a*a;
        int sum=0,rem;
        while(b!=0)
        {
            rem= b%10;
            sum=sum+rem;
            b=b/10;
        }
        if(a==sum){
            System.out.println("given num is a neon that is :"+a);
        }
        else{
            System.out.println("num " + a + " is not a neon number");
        }


    }
}
