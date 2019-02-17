package tool;

import model.Menu;

public class AddDish {
  public static void AddDish() {
    Menu menu0 = new Menu("ITEM0001", "黄焖鸡", 18.00);
    Menu menu1 = new Menu("ITEM0013", "肉夹馍", 6.00);
    Menu menu2 = new Menu("ITEM0022", "凉皮", 8.00);
    Menu menu3 = new Menu("ITEM0030", "冰锋", 2.00);
    Menu.allMenus.add(menu0);
    Menu.allMenus.add(menu1);
    Menu.allMenus.add(menu2);
    Menu.allMenus.add(menu3);
  }
}
