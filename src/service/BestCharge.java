package service;

import tool.AddDish;
import tool.AddHalfPriceDish;

import java.util.Scanner;
import static service.PrintOrder.getBill;

public class BestCharge {
  public static void main(String[] args) {
    AddDish.AddDish();
    AddHalfPriceDish.AddHalfPriceDish();
    Scanner scan = new Scanner(System.in);
    System.out.println("欢迎来到本店，请输入菜品");
    String strInput = scan.nextLine();
    System.out.println(getBill(strInput.split(", ")));
    scan.close();
  }
}
