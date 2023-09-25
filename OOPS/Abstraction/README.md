# Abstraction : 
        Abstraction is a way of hiding the unecessay details from user. 
  
   ### Abstraction in Java can be achieved using the following tools it provides :
        Both are used to achieve abstraction.
 
   1. Interface  :  It's only has abstraction methods. And supports multiple inheritance : 
    * remember java doesn't support multitple inheritance but in Inheritance it supports 

            Blueprint of a class 
            it actually start with 
                *interface I {

                    void hello ()  
                    void solve()
                    void run();
                }

   2. Abstract Class : It can have both abstract and non abstract methods.


        abstract class inf {
        abstract void run();
        abstract void hello();
        int x;
        }