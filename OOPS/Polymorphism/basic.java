package OOPS.Polymorphism;

// import OOPS.Polymorphism.edution.school;

class edution {
    int student;
    int teachers;
    edution() {
        System.out.println("i am a constructor of education ");
    }
void solve () {
    System.out.println("Welcome to the world of education.");
}
}

    class school extends edution {
        int ground;
 void solve () {
    System.out.println("Welcome to the world of school.");
}
    }
   
class bye {
    int ht;
    int wt;

    bye (int ht, int wt) {
        this.ht = ht;
        this.wt = wt;
    }

    void hello () {
        System.out.println("Welcome to the Hello World ");
    }
    void hello(int x) {
        System.out.println("Welcome to the world of "+ x);
    }
}
public class basic {
    public static void main(String[] args) {
        // System.out.println();
        // bye obj = new bye(2, 3);
        // obj.hello(1);
        // obj.hello();

        // edution edu = new edution();
        // edu.solve();
        // school scl = new school();
        // scl.solve();
        edution ob1 = new school();   // if we have right side have school the function school will be called if right side have any func. it calls that func.
        ob1.solve();

        edution ob2 = new edution(); // here it calls education func because right side also have education func.
        ob2.solve();    // it also call education contruction.


    }
    
}

// child constructor a
// compile time polymorphism 