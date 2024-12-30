package oopiii.enums;

public class Test {

  public static void main(String[] args) {
    Pizza pizza = new Pizza(Size.MEDIUM);
    pizza.orderPizza();
    System.out.println(Size.SMALL.ordinal());
    System.out.println(Size.MEDIUM.ordinal());
    System.out.println(Size.LARGE.ordinal());
    System.out.println(Size.EXTRALARGE.ordinal());
  }
}
