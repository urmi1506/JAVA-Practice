import java.util.Scanner;
public class simpleinterest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of principal:");
        int p=sc.nextInt();
        System.out.println("Enter value of rate:");
        int r=sc.nextInt();
        System.out.println("Enter value of time:");
        int t=sc.nextInt();
        int SI=p*r*t/100;
        System.out.println("simple interest is:"+SI);
    }
}
