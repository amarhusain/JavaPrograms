package oopiii.innerclass;

public class TestCar {

  public static void main(String[] args) {
    Car car1 = new Car("Mazda", "8WD");
    Car.Engine engine = car1.new Engine();
    engine.setEngine();
    System.out.println("Engine Type for 8WD= " + engine.getEngineType());

    Car car2 = new Car("Crysler", "4WD");
    Car.Engine c2engine = car2.new Engine();
    c2engine.setEngine();
    System.out.println("Engine Type for 4WD = " + c2engine.getEngineType());

    Car car3 = new Car("Maruti Ertiga", "4WD");
    Car.Engine c3engine = car3.new Engine();
    c3engine.setEngine();
    System.out.println("Engine Type for 4WD = " + c3engine.getEngineType());
  }
}
