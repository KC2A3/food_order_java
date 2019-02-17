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
}
