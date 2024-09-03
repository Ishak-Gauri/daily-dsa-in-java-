
import java.util.Scanner;


class quicksort_algo
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of array");
       int n = sc.nextInt();
       int[] arr= new int[n];
       System.out.println("Enter the elements of array");
       for(int i =0;i<n;i++)
       {
        arr[i]= sc.nextInt();
       }
       int start =0;
       int end = arr.length-1;
        quicksort(arr,start,end);
        System.out.println("The elemnts of sorted array are");
        for(int i:arr)
        {
            System.out.println(i+" ");
        }
    }

    static void quicksort(int[] arr,int start,int end)
    {
        if (start < end)
        {
            int mid = divide(arr,start,end);
            quicksort(arr,start,mid-1);
            quicksort(arr,mid+1,end);
        }
    }

    static int divide (int[] arr,int start,int end)
    {
           int pivot= arr[start];
           int p = start+1;
           int q = end;

           while(p <= q) 
           {
            if (p <= q && arr[p] <= pivot)
            {
                p++;
            }

            if (p <= q && arr[q] > pivot)
            {
                q--;
            }
           }
            if(p < q) 
            {
                int temp = arr[p];
                arr[p] = arr[q];
                arr[q]= temp;
                p++;
                q--;
            }
            int temp = arr[start];
            arr[start]= arr[q];
            arr[q]= temp;

            return q;
           
     }
}