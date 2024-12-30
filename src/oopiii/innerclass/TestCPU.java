package oopiii.innerclass;

public class TestCPU {

  public static void main(String[] args) {
    CPU cpu = new CPU();

    // create an object of inner class Processor using outer class
    CPU.Processor processor = cpu.new Processor();

    // create an object of inner class RAM using outer class CPU
    CPU.RAM ram = cpu.new RAM();
    System.out.println("Processor Cache = " + processor.getCache());
    System.out.println("Ram Clock speed = " + ram.getClockSpeed());
  }

}