import java.util.Scanner;

public class Binary_Search {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int high = a.length;
        int low = 0;
        int mid = (low + high)/2;
        int k = 3;
        int flag = 0;
        while(low <= high) {

            mid = (low + high)/2;
            if(a[mid] == k) {
                System.out.println("Found target element at position: " + mid);
                flag = 1;
                break;
            } else if(a[mid] < k) {
                low = mid;
            } else {
                high = mid - 1;
            }

        }
        if(flag == 0) {
            System.out.println("The target element is not in the array.");
        }

    }

}
