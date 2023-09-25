// there are four pillar on oops 

inheretance .  
polymorphism. 
abstract .
encapsulation.


public class Main
{
    static class Student {
        String name;      // all this things are property and attribute of Student class
        int RollNo;
        int age;
        boolean Gender;
        
      //  class :- is a template of an object 
     //  objects : is a instance of a class.  {object is a real world entity}
        
 /*       Car --------> is a class 
        Toyato   vrundra 
        Maruti   Mercedes
        Audi     Scorpio
        
        
        */
        	Student() {
/*
   #Constructor 
             to set default value if an't assign value;
   This is a contructor so the purpose of this is assign tdefault values 
   
   
   System construntor  : well not be call...
*/	
   System.out.println("Hello i have etered the constructor ");
	    
	}
    }
    
    static class Human {
        float Height = 153 ;
        String skin = "Light red";
       static int weight = 60 ;  // property of class 
       // weigth is not associated with the object 
       // it take memory once 
        
    }
	public static void main(String[] args) {
	    
	   // Student s1 = new Student(); // way to declare object
	    
	    Human sap = new Human();
	    
	    System.out.println(sap.skin);
	    System.out.println(sap.Height + "cm");
	    System.out.println(sap.weight+ " kg");
	    
	    Student all = new Student();
	    all.name = " Hello";
	    all.age = 20;
	    System.out.println(all.name);
	    System.out.println(all.RollNo);
	    System.out.println(all.age);
	    System.out.println(all.Gender);
	}
	

	
}

/*
  - wrapper class : it's there to wrap the primitive data types.
    object : it's an instance of class or (which present in real life e.g book , table )
    in object meory takes again and again e.g : if i write s1.name twice or thrice it take memory how many time we call it 
    class : which is bueprint of all object. 

    Final "KeyWord" :-  if some thing assigned final then it can't be changed.
------------------------------------------------------
   -  static  : we can declare static in:  
      `static variable 
      ` static method 
      `static block
-----------------------------------------------------
     
     - take memory only  once 
     - if data type have static now it's property of the object
        e.g if our class name is Student we can call it with Student.ROllNo

    
====================================================================================================
------------------------------------------------------------------------------------
String[] ===========> passing all the arguements int array of String 

   - class inside class can be static
   - main class is not static.

*/

====================================================
contractor           :      Function or method   
=====================:==============================
no return            :      it has return
name same as parent  :        any name 
                     :
====================================================


# Acess Modifiers : 
    - public : if any attribute, class method set to public it's acessable from anywhere in  thefile  or outside the file in a package 
    - private : it's accesable only in the class 
    - protected  : In the file , outside of the file in same package by subclass only 
    - default : 