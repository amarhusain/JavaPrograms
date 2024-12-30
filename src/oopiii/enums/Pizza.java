package oopiii.enums;

public class Pizza {
  Size pizzaSize;
  public Pizza(Size pizzaSize) {
    this.pizzaSize = pizzaSize;
  }

  public void orderPizza() {
    switch(pizzaSize) {
      case SMALL:
        System.out.println("I ordered a " + Size.SMALL.getSize() +" pizza");
        break;
      case MEDIUM:
        System.out.println("I ordered a " + Size.MEDIUM.getSize() + " pizza");
        break;
      default:
        System.out.println("I don't know which one to order.");
        break;
    }
  }

}
