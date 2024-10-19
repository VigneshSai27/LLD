package without.design.principles.openclosed;

public class DiscountCalculator {
    void calculateDiscount(String type, int discountPercent) {
        if(type.equals("Premium")) {
            System.out.println("Premium Discount");
        } else if (type.equals("Ordinary")) {
            System.out.println("Ordinary Discount");
        }
    }
}
