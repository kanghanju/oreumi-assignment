package weeklyquiz.interfacebasic;

public class Main {
    public static void main(String[] args){
        DeliveryChargeCalculator Beauty1 = new Beauty("화장품1",20000,2);
        DeliveryChargeCalculator Beauty2 = new Beauty("화장품2",70000,7);
        DeliveryChargeCalculator Beauty3 = new Beauty("화장품3",110000,11);

        System.out.println("총 배송비:"+ Beauty1.getDeliveryCharge(2,20000)); //중복 코드 발생,,,, 뭔가 많이 잘못됐다
        System.out.println("총 배송비:"+ Beauty2.getDeliveryCharge(7,70000));
        System.out.println("총 배송비:"+ Beauty3.getDeliveryCharge(11,110000));
    }
}
