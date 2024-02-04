package weeklyquiz.interfacebasic;

public class LargeAppliance extends Product implements  DeliveryChargeCalculator{
    public LargeAppliance(String name, int price, int weight) {
        super(name, price, weight);
    }

}
