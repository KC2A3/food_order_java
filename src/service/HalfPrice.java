package service;

import model.Menu;
import model.Order;
import model.Dish;
import model.PromotionType;

import java.util.ArrayList;

public class HalfPrice extends PromotionType {
  public HalfPrice() {
    super("指定菜品半价");
  }

  public static ArrayList<Menu> specialList = new ArrayList<Menu>();

  public static ArrayList<String> dishName(Order order) {
    ArrayList<String> specialItemNames = new ArrayList<String>();
    for (Dish dish : order.getOrder()) {
      for (Menu specialMenu : specialList) {
        if (dish.getMenu().equals(specialMenu.getId())) {
          specialItemNames.add(specialMenu.getName());
        }
      }
    }
    return specialItemNames;
  }

  @Override
  public double HalfPrice(Order order) {
    double discountPrice = 0;
    for (Dish dish : order.getOrder()) {
      for (Menu specialMenu : specialList) {
        if (dish.getMenu().equals(specialMenu.getId())) {
          discountPrice += dish.gerTotalOfEach() * 0.5;
        }
      }
    }
    return discountPrice;
  }
}
