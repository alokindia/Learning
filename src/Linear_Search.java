import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int []random= new int[10];
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
            random[i]= sc.nextInt();
        System.out.println("Enter element to be searched:");
        int element = sc.nextInt();
        for(int j=0;j<n;j++){
            if(random[j]==element){
                System.out.println("Found element at:"+(j+1));
            }
        }

    }
}
