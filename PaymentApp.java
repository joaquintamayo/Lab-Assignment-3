public class PaymentApp {

    public static void main(String[] args) {

        String item = "keyboard";
        double unitPrice = 300.0;
        int quantity = 10;

        System.out.println("Order item is " + item + ".");
        System.out.println("Unit price is " + unitPrice);
        System.out.println("Quantity is " + quantity);

        Order transaction1 = new Order("keyboard", 10, 300, new GCash());
        printOrderDetails(transaction1);

        Order transaction2 = new Order("keyboard", 10, 300, new Maya());
        printOrderDetails(transaction2);

        Order transaction3 = new Order("keyboard", 10, 300, new ShopeePay());
        printOrderDetails(transaction3);

    }

    private static void printOrderDetails(Order order) {


            System.out.println("\nPayment order details if " + order.getMode().getClass().getSimpleName());
            System.out.println("Discount rate is " + order.getMode().determineDiscountRate());
            System.out.println("Payment amount is " + order.getTotalAmount());

    }
}