package model;

import java.lang.String;

public class Dish {
  private Menu menu;
  private int count;

  public Dish(String input) {
    String[] inputs = input.split(" x ");
    this.menu = Menu.getItem(inputs[0]);
    this.count = Integer.valueOf(inputs[1]);
  }

  public Menu getMenu() {
    return menu;
  }

  public int getCount() {
    return count;
  }

  public double gerTotalOfEach() {
    return this.getMenu().getPrice() * this.getCount();
  }

  public StringBuffer printDetail() {
    StringBuffer detail = new StringBuffer("");
    detail.append(this.getMenu().getName());
    detail.append(" x ");
    detail.append(this.getCount());
    detail.append(" = ");
    detail.append(this.gerTotalOfEach());
    detail.append("元");
    return detail;
  }
}
