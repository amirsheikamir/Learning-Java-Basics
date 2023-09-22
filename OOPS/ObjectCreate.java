package OOPS;

import recursion.sortedArray;

class Student {
      int age;
      String name;
      int ClasS;
      int RollNo;  
    }
public class ObjectCreate {

    
    public static void main(String[] args) {
        
        Student data = new Student();
        data.age = 18;
        data.name = "Warlock";
        data.ClasS = 12;
        data.RollNo = 5;
        System.out.println("Name : "+ data.name);
        System.out.println("Age : "+data.age);
        System.out.println("Roll No : "+data.RollNo);
        System.out.println("class : "+data.ClasS+"th");
    }
}
