package sample.cafekiosk.unit;

import sample.cafekiosk.unit.beverage.Americano;
import sample.cafekiosk.unit.beverage.Latte;
import sample.cafekiosk.unit.order.Order;

import java.time.LocalDateTime;

public class CafeKioskRunner {
    public static void main(String[] args) {
        CafeKiosk cafeKiosk = new CafeKiosk();
        cafeKiosk.add(new Americano());
        System.out.println(">>>> 아메리카노 추가");

        cafeKiosk.add(new Latte());
        System.out.println(">>>> 라떼 추가");

        int totalPrice = cafeKiosk.calculateTotalPrice();
        System.out.println("총 주문 가격: " + totalPrice);

        // 테스트 할때는 createOrder 파라미터에 내가 원하는 시간을 넣을수있게 하고
        // 실제 프로덕션 코드에는 실제 시간을 넣게 만들어줌.
        Order order = cafeKiosk.createOrder(LocalDateTime.now());

    }
}
