package oopiii.anonymousclass;

public class AnonymousDemo2 {

  public void createClass() {
    // anonymous class implementing interface
    Polygon2 p1 = new Polygon2() {
      public void display() {
        System.out.println("Inside an anonymous class.");
      }
    };
    p1.display();
  }

}
