public class merge_sort {

    public static void merge(int[] a, int l, int mid, int r) {
        int n1 = mid - l + 1; // Size of left subarray
        int n2 = r - mid;     // Size of right subarray

        // Temporary arrays to hold the subarray elements
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            left[i] = a[l + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = a[mid + 1 + i];
        }

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }

        // Copy remaining elements of left[] if any
        while (i < n1) {
            a[k++] = left[i++];
        }

        // Copy remaining elements of right[] if any
        while (j < n2) {
            a[k++] = right[j++];
        }
    }

    public static void mergesort(int[] a, int l, int r) {
        if (l >= r) {
            return; // Base case: single element or invalid range
        }

        int mid = l + (r - l) / 2; // Calculate mid-point to avoid overflow
        mergesort(a, l, mid);      // Sort the left half
        mergesort(a, mid + 1, r);  // Sort the right half
        merge(a, l, mid, r);       // Merge the sorted halves
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 10, 5, 98};
        System.out.println("Original array:");
        for (int num : a) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nSorting the array...");
        mergesort(a, 0, a.length - 1);

        System.out.println("Sorted array:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
