public class count_sort 
{
    public static void countsort(int[] a)
    {
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            max=a[i];
        }
        int[] freq=new int[max+1];
        for(int i=0;i<a.length;i++)
        {
            freq[a[i]]++;
        }
        int k=0;
        for(int i=0;i<freq.length;i++)
        {
            for(int j=0;j<freq[i];j++)
            {
                a[k++]=i;
            }
        }
        for(int i:a)
        System.out.print(i+" ");
    }
    public static void main(String[] args) 
    {
        int[] a={3,1,4,5,3,2};
        countsort(a);
    }
    //best case: O(N)
    //avg and worst case : O(N+k) n is number of elements in array and k is max ele in the array
    //space complexity: O(N+K) which is the extra array created
}
