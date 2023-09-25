=============================================================================
# Inheritance -----> Qualities inherit from parents like (DNA)

 - classA (Parent Class)
 - classB (child Class)

  - child class will inherit the parent class
 
 - class B extends class A using extend keyword we can get properties from parents 

  - class B have a properties of Class A and also they have their own properties.


  - we can make child more than one 

 ============================================================================
# Types of inheritence and examples : 
       - signle Inheritance : parent has one child.
``` java
       class child_girl extends Parent {

    String name;
    child_girl() {
    this.name = "Sanchita";
    }
```
       - Multi level Inhertiance : Grandparent -> Parent -> child 


       - Herarichy Inheritance : one parent multiple child.
``` java
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

```

=====================================================================

## super----> keyword. 
    - super keyword : super help to call the parent class contructor.
    
    - super also call attribute super super.age = age;
    - super also call method super.method();

