//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int n=8;
    for(int i=1;i<=n;i++)
    {
        if(i<=3)
        {
            System.out.print("      ");
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        else if(i==4){
            System.out.print("* * *");
    }
        else if(i==5) {
            System.out.println(" ");
            System.out.print("      * * *");
        }
        else{
            System.out.println("      ");
            for(int j=1;j<=(n-i+1);j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
    }
    }
    }
}