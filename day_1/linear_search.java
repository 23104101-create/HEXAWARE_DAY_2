
import java.util.*;

public class linear_search {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter search element: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {

            if (arr[i] == key) {
                found = true;
                System.out.println("Element found at position: " + (i + 1));
                break;
            }
        }

        if (found == false) {
            System.out.println("Element Not Found");
        }
    }
}
