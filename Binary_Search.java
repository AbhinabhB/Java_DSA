import java.util.Scanner;

public class Binary_Search {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array.");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int high = a.length;
        int low = 0;
        int mid;
        System.out.print("Enter the Target element: ");
        int k = sc.nextInt();
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
