package service;

import model.Order;
import model.PromotionType;

public class Full30 extends PromotionType {
  public Full30() {
    super("满30减6元");
  }

  public double HalfPrice(Order order) {
    return order.getTotal() >= 30 ? 6 : 0;
  }
}