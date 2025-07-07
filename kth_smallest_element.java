import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class kth_smallest_element
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0 ; i < n ; i++)
        {
            arr[i]= sc.nextInt();
        }
        int l = arr[0];
        int r = n-1;
        int k = 4;
        int ans = kth_largest(l,r, k , arr);
        System.out.println("kth samllest element of the array is");
        System.out.println(ans);
    }

    static int kth_largest(int l , int r , int k ,int[] arr)
    {
        PriorityQueue<Integer> max_heap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0 ; i < k ; i++)
        {
            max_heap.add(arr[i]);
        }

        for (int i = k ; i <= r ; i++)
        {
            if ( arr[i] < max_heap.peek())
            {
                max_heap.poll();
                max_heap.add(arr[i]);
            }
        }

        return max_heap.peek();
    }
}