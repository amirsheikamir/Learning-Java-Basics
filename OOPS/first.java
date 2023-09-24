package OOPS;

class Student {

    static int age;

    Student(int x) {
        age = x;
    }
}
public class first {
    public static void main(String[] args) {
        Student s1 = new Student(5);
        System.out.println(s1.age+" ");
         Student s2  = new Student(5);
         System.out.println(s1.age+ " " + s2.age);
         Student s3 = new Student(5);
         Student.age = 7;
          System.out.println(s1.age+ " " + s2.age+" " + s3.age);

    }
}
