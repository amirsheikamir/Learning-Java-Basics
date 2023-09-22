package OOPS;

 class Student {

    // static void hello() {
    //     System.out.println("hello");
    // }

/*   static void main
  static -->   if we have a static method we call it directly from class 
  if fuction is a static it's a property of class 

/*
     static function call to non-static 

     non-static to static 
 */


 /* 
    what is static block : 
    a piece of code which executes even before the main..
*/
public int solve(int i){
     //non-static function 
        
        System.out.println(i);
        return i;
}
 }
public class staticClass {
  
    

    public static void main(String[] args) {

        Student s1 = new Student();
       s1.solve(2); //  this throw error because we can't call non- static function directly wihtout object we can't call it directly

    //    Student.hello(5);

    }
    static {
        // static black  is call before main  also 
        // currently no need of this anywhere... 
        System.out.println("Hello");
    }
}
