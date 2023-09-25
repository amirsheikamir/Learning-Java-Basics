package OOPS.Abstraction;


abstract class inf {

    // abstract methods
   abstract void run();
   abstract void hello();

   int x;
}
class student implements inf {
  public void run() {
        System.out.println("RUNNING");
    }
  public void hello(){
        System.out.println("HELLO WORLD");
    }

}

public class AbstractBasic {
    public static void main(String[] args) {
        
        student s1 = new student();
        s1.run();
        s1.hello();
    }
}
