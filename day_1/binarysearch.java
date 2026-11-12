
import java.util.*;

public class binarysearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter search element: ");
        int key = sc.nextInt();

        int l = 0;
        int r = n - 1;
        boolean found = false;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid] == key) {
                found = true;
                break;
            }
            else if (arr[mid] < key) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        if (found)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}
