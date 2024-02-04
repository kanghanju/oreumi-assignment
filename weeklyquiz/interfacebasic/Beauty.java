package weeklyquiz.interfacebasic;

public class Beauty extends Product implements DeliveryChargeCalculator{
    public Beauty(String name, int price, int weight) {
        super(name, price, weight);
    }

}
