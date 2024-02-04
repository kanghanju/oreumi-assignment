package weeklyquiz.interfacebasic;

public class Grocery extends Product implements DeliveryChargeCalculator{
    public Grocery(String name, int price, int weight) {
        super(name, price, weight);
    }

}
