package model;

import java.lang.String;

public class Dish {
  private String menu;
  private int count;

  public Dish(String input) {
    String[] inputs = input.split(" x ");
    this.menu = (inputs[0]);
    this.count = Integer.parseInt((inputs[1]));
  }

  public String getMenu() {
    return this.menu;
  }

  public int getCount() {
    return this.count;
  }
}
