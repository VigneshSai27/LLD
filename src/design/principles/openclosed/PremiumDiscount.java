package design.principles.openclosed;

public class PremiumDiscount extends DiscountCalculator{
    @Override
    void calculateDiscount(int discountPercent) {
        System.out.println("Premium Discount");
    }
}
