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
    return menu;
  }

  public int getCount() {
    return count;
  }

  public double gerTotalOfEach() {
    return  this.getCount();
  }

  public StringBuffer printDetail() {
    StringBuffer detail = new StringBuffer();
    detail.append(
        this.getMenu()+ "x" + this.getCount() + "=" + this.gerTotalOfEach() + "元");
    return detail;
  }
}
