
import java.util.*;

public class RetailOrderSearch {

    static class Order {
        int orderId;
        String customer;
        double amount;

        Order(int id, String name, double amt) {
            orderId = id;
            customer = name;
            amount = amt;
        }

        public String toString() {
            return orderId + " " + customer + " " + amount;
        }
    }

    // Linear Search
    static Order linearSearch(Order[] orders, int id) {

        for (Order o : orders) {
            if (o.orderId == id) {
                return o;
            }
        }

        return null;
    }

    // Binary Search
    static Order binarySearch(Order[] orders, int id) {

        int low = 0;
        int high = orders.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (orders[mid].orderId == id) {
                return orders[mid];
            }
            else if (orders[mid].orderId < id) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Sample retail orders
        Order[] orders = {
            new Order(1005, "C105", 2000),
            new Order(1002, "C102", 3500),
            new Order(1004, "C104", 4500),
            new Order(1001, "C101", 2500),
            new Order(1003, "C103", 1500)
        };

        System.out.print("Enter Order ID: ");
        int id = sc.nextInt();

        // Linear Search
        System.out.println("\nLINEAR SEARCH:");

        Order result1 = linearSearch(orders, id);

        if (result1 != null) {
            System.out.println("Order Found: " + result1);
        } else {
            System.out.println("Order Not Found");
        }

        // Sort orders by ID
        Arrays.sort(orders,
            Comparator.comparingInt(o -> o.orderId));

        // Binary Search
        System.out.println("\nBINARY SEARCH:");

        Order result2 = binarySearch(orders, id);

        if (result2 != null) {
            System.out.println("Order Found: " + result2);
        } else {
            System.out.println("Order Not Found");
        }

        sc.close();
    }
}

