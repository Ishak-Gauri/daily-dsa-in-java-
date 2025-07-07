import java.util.*;
class kth_largest_element
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the kth largest element number to be find");
        int k = sc.nextInt();
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the elements of array");
        for (int  i = 0 ; i < n ; i++)
        {
            arr[i]= sc.nextInt();
        }

        int l = arr[0];
        int r = n-1;
        System.out.println("The fourth largest element of the array is");
        System.out.println(kth_largest(l,r,k,arr));

    }

    static int kth_largest(int l ,int r , int k , int[] arr)
    {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for (int i = 0 ; i < k ; i++)
        {
            minheap.add(arr[i]);
        }

        for (int i = k ; i <= r ; i++)
        {
            if (arr[i] > minheap.peek())
            {
                minheap.poll();
                minheap.add(arr[i]);
            }
        }

        return minheap.peek();
    }
}