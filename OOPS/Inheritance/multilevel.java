package OOPS.Inheritance;

class Parent {
    int height;
    int weight;
    String FamilyName;

    Parent() {
        this.height = 1;
        this.weight = 1;
        this.FamilyName = "Sharma";

    }
}
class child extends Parent {
    // now child have all the property of Parent 
    // in addition to it you can have your own properties also.
    int age;
    child() {
        this.age = 1;
    }
}
class child1 extends child {
    int roll;
    child1() {
        this.roll = 10;
    }
}
public class multilevel {
    public static void main(String[] args) {
        
        child1 obj = new child1();
        System.out.println(obj.roll+ "\n " +obj.age + "\n " + obj.FamilyName );
    }
    
    
}
