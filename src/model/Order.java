package model;

import java.lang.String;
import java.util.ArrayList;

public class Order {
  private ArrayList<Dish> order;

  public Order(String[] orderInput) {
    this.order = new ArrayList();
    for (String str : orderInput) {
      this.order.add(new Dish(str));
    }
  }

  public ArrayList<Dish> getOrder() {
    return order;
  }

  public double getTotal() {
    double total = 0;
    for (Dish dish : this.order) {
      total += dish.gerTotalOfEach();
    }
    return total;
  }

  public StringBuffer printDetail() {
    StringBuffer detail = new StringBuffer();
    for (Dish dish : this.order) {
      detail.append(dish.printDetail() + "\n");
    }
    return detail;
  }
}
