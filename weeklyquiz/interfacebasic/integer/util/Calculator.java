package weeklyquiz.interfacebasic.integer.util;

public class Calculator {
    public static int getDeliveryCharge(double weight,int price){
        int baseDeliveryCharge = getBaseDeliveryCharge(weight);

        if(baseDeliveryCharge < 30000){
            return baseDeliveryCharge;
        }else if(price < 100000){
            return baseDeliveryCharge - 1000;
        }
        return 0;
    }

    private static int getBaseDeliveryCharge(double weight){
        int deliveryCharge;
        if(weight < 3.0){
            deliveryCharge = 1000;
        }else if(weight < 10){
            deliveryCharge = 5000;
        }else{
            deliveryCharge = 10000;
        }

        return deliveryCharge;
    }
}
