public class bubble_sort 
{
    public static void bubble(int[] a)
    {
        int n=a.length;;
        loop2:for(int i=0;i<n-1;i++)
        {
            boolean flag=false;
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true;
                }
                if(flag==false)
                break loop2;

            }
        }
        for(int i:a)
        System.out.print(i+" ");
    }
    public static void main(String[] args) 
    {
        int[] a={3,10,17,44,100};
        bubble(a);
        //space complexity:O(1)
        //time complexity:O(N^2)
        //for optimized bubble sort best case:O(N)
        //bubble sort is stable sorting algo (algo in which the original order of the unsorted array is maintained in case of duplicates)
        //bubble sort is inplace algo cuz it doesn't use extra space (no extra space used)
        //tc: bc-O(N) ac-O(N^2) wc-O(N^2)
    }
}
