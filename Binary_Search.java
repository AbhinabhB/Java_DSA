public class Binary_Search {

    public static void binary_search(int[] a, int high, int low, int k) {

        int mid;
        int flag = 0;
        while(low <= high) {

            mid = (low + high)/2;
            if(a[mid] == k) {
                System.out.println("\nFound target element at position: " + mid);
                flag = 1;
                break;
            } else if(a[mid] < k) {
                low = mid;
            } else {
                high = mid - 1;
            }

        }
        if(flag == 0) {
            System.out.println("\nThe target element is not in the array.");
        }

    }

}
