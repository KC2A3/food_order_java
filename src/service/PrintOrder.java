package service;

import model.Order;

public class PrintOrder {

    public static String getBill(String[] inputStr) {
        StringBuffer dishList = new StringBuffer("============= 订餐明细 =============\n");
        Order order = new Order(inputStr);
        dishList.append(order.printDetail());
        dishList.append("-----------------------------------\n");
        Full30 promotionFull30 = new Full30();
        HalfPrice promotionHalfPrice = new HalfPrice();
        double discount6 = promotionFull30.HalfPrice(order);
        double discountHalf = promotionHalfPrice.HalfPrice(order);
        double discount = 0.0;
        if (discount6 != 0.0 && discountHalf != 0.0) {
            if (discount6 >= discountHalf) {
                discount = discount6;
                dishList.append("使用优惠:\n" +
                        "满30减6元，省6元\n" +
                        "-----------------------------------\n");
            } else {
                discount = discountHalf;
                dishList.append("使用优惠:\n" +
                        "指定菜品半价(" +
                        String.join(",", promotionHalfPrice.dishName(order)) +
                        "),省" +
                        discountHalf +
                        "元\n" +
                        "-----------------------------------\n");
            }
        }
        double finalPay = order.getTotal() - discount;
        dishList.append("总计：" + finalPay + "元\n" +
                "===================================");
        return dishList.toString();
    }
}
