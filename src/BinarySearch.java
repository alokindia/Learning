import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        int []array=new int[]{1,2,3,4,5,6,7,8,9,10};
        int high= array.length;
        System.out.println(high);
        int low=0,mid;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter item to be searched:");
        int item = sc.nextInt();
        mid=(high+low)/2;
        while(low<=high){
            if ( array[mid] < item ){
                low = mid + 1;
            }else if ( array[mid] == item ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                high = mid - 1;
            }
            mid=(high+low)/2;
            }
        }
    }
