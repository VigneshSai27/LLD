package without.design.principles.openclosed;

public class MainApp {
    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();
        discountCalculator.calculateDiscount("Premium", 15);
        discountCalculator.calculateDiscount("Ordinary", 10);
    }
}
