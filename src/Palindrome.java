import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int temp=n,sum=0,r;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("~Palindrome");
        }
        }
    }

