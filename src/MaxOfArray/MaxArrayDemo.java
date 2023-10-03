package MaxOfArray;

import java.util.Scanner;

public class MaxArrayDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array n:");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Input array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max of the given array is: "+max);
    }
}
