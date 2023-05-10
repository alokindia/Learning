import java.util.Scanner;

public class Insert_Random {
    public static void main(String[] args){
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        array[0]=4;
        array[1]=7;
        array[2]=9;
        array[3]=2;
        array[4]=6;
        for(int i=0;i<array.length;i++)
            System.out.println(array[i]);
        System.out.println("Index you want to insert number:");
        int index= sc.nextInt();
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        for(int j= array.length-1;j>=index;j--){
            array[j+1]=array[j];
        }
        array[index]=number;
        for(int i=0;i<array.length
                ;i++)
            System.out.println(array[i]);
    }
}
