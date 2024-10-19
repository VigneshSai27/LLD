package design.principles.openclosed;

public class OrdinaryDiscount extends DiscountCalculator{
    @Override
    void calculateDiscount(int discountPercent) {
        System.out.println("Ordinary Discount");
    }
}
