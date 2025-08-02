public class heap_sort
{
    public static void main(String[] args) 
    {
        int arr[] = {12,34,56,11,0,9};
        int n = arr.length;
         build_heap(arr,n);
         heap_sort(arr,n);
         for (int nums : arr)
         {
            System.out.println(nums+ " ");
         }
    }

    static void heapify(int[] arr ,int n ,int i)
    {
        int largest = i ;
        int left = 2*i+1;
        int right = 2*i+2;

        if (left < n && arr[left] > arr[largest])
        {
            largest = left ;
        }
        if (right < n && arr[right] > arr[largest])
        {
            largest = right;
        }
        if (largest != i)
        {
            swap(arr,i,largest);
            heapify(arr,n, largest);
        }
    }

    static void build_heap(int[]arr ,int n)
    {
        for (int i = n/2-1; i >= 0 ; i--)
        {
            heapify(arr,n,i);
        }
    }

    static void heap_sort(int[] arr ,int n)
    {
        for(int i = n-1 ; i >= 1 ; i--)
        {
            swap(arr,0,i);
            heapify(arr,i,0);
        }
    }
    static void swap(int[] arr ,int i ,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
}
