package model;

import java.util.ArrayList;

public class Menu {
  private String id;
  private String name;
  private double price;

  public Menu(String id, String name, double price) {
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

  public double getPrice() {
    return this.price;
  }

  public static ArrayList<Menu> allMenus = new ArrayList<Menu>();

  public static Menu getItem(String id) {
    Menu found = new Menu("ITEM0000", "NOT FOUND", 0);
    for (Menu menu : allMenus) {
      if (menu.getId().equals(id)) {
        found = menu;
        break;
      }
    }
    return found;
  }
}
