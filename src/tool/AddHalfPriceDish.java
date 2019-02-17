package tool;

import model.Menu;
import service.HalfPrice;

public class AddHalfPriceDish {
  public static void AddHalfPriceDish() {
    Menu menu0 = new Menu("ITEM0001", "黄焖鸡", 18.00);
    Menu menu1 = new Menu("ITEM0022", "凉皮", 8.00);
    HalfPrice.specialList.add(menu0);
    HalfPrice.specialList.add(menu1);
  }
}
