package model;

import java.util.ArrayList;

public class Menu {
  private String id;
  private String name;
  private int price;

  public Menu(String id, String name, int price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public int getPrice() {
    return this.price;
  }

  public static ArrayList<Menu> allMenus = new ArrayList<Menu>();
}
