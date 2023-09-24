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
class child_girl extends Parent {

    String name;
    child_girl() {
    this.name = "Sanchita";
    }
}

public class First {
    public static void main(String[] args) {
        
        Parent p1 = new Parent();

        child c1 = new child();
        c1.height = 10;
        System.out.println(c1.height);

        child_girl c2 = new child_girl();
        System.out.print(c2.name+" " + c2.FamilyName);
    }
}
