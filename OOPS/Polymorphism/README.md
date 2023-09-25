# Polymorphism : 
Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance. Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks.
***
  * Poly - many 
     *  morphism - forms 
 ## Types of Polymorphism 
 > Compile Time Polymorphism : compile time decide which constructor take.
   - Method overriding :  Two methods having same name but diff. arguement, data type of arguement. 

> Runtime Polymorphism : when you have 2 functions of same name & same parameter.

---

### Overloading : 
        is a type of static polymorphism. In Method overloading, we can define multiple methods with the same name but with different parameters. 
``` java
  void hello () {
        System.out.println("Welcome to the Hello World ");
    }
    void hello(int x) {
        System.out.println("Welcome to the world of "+ x);
    }
```

### Overridding : 
     is a mechanism to achieve polymorphism where the super class and the sub-class have same methods, including the parameters and signature.
``` java
class Adder{  
  static int add(int a,int b){return a+b;}  
static double add(int a,int b){return a+b;}  
}  
class TestOverloading3{  
  public static void main(String[] args){  
    System.out.println(Adder.add(11,11));//ambiguity  
}}  
```

```
  - same name function  error come duplicate method
output:
* 
Compile Time Error: method add(int,int) is already defined in class Adder
```