package Exception1;
public class Problem5 {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new Exception("No coupon code provided");
            }
            String couponCode = args[0];
            if (couponCode.equals("COUPON123")) {
                System.out.println("Coupon code applied successfully");
            } else {
                throw new Exception("Invalid Coupon Code");
            }
        } catch (Exception e) {
            System.out.println("Failed to apply coupon: " + e.getMessage());
        } finally {
            System.out.println("Thank you for shopping with us!!");
        }
    }
}
