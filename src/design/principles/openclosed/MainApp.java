package design.principles.openclosed;

// Definition: Software entities should be open for extension but closed for modification.

public class MainApp {
    public static void main(String[] args) {
        DiscountCalculator premiumDiscount=new PremiumDiscount();
        premiumDiscount.calculateDiscount(15);
        DiscountCalculator ordinaryDiscount=new OrdinaryDiscount();
        ordinaryDiscount.calculateDiscount(10);
    }
}
