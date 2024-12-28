public class insertion_sort 
{
    private static void insertion(int[] a) 
    {
        int n=a.length;
        for(int i=1;i<n;i++)
        {
            int j=i;
            while(j>0 && a[j]<a[j-1])
            {
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }
        for(int i:a)
        System.out.print(i+" ");
    }
    public static void main(String[] args) 
    {
        int[] a={5,3,10,1,9,9};
        insertion(a);

        //Best case time complexity: O(N)
        //Worst case : O(N^2) 
        //Avg case : O(N^2)
        //Space complexity: O(1)
        //It is a stable algorithm
    }

    
}
