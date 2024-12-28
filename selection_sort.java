public class selection_sort 
{
    public static void selection(int[] a)
    {
        int n=a.length;
        
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[min])
                min=j;
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for(int i:a)
        System.out.print(i+" ");

    }
    public static void main(String[] args) 
    {
        int[] a={2,1,13,10,4,1};
        selection(a);

        //Space complexity O(1) if extra array is not used
        //Time complexity O(N^2) ->all times have same complexity
        //Due to swappings, the algo is not stable
        //It is an inplace algo

    }
}
