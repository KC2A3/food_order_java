package model;

public abstract class PromotionType {
  private String type;

  public PromotionType(String type) {
    this.type = type;
  }

  public abstract double HalfPrice(Order order);
}
