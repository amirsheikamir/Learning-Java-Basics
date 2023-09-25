package OOPS.Abstraction;


// it supports both static, final and  simpe void...

    interface inf{
        void run();
     void hell();
        void bye();
        
        static int x = 5;   // we can use only two ways static or final only any data type or variables we can use.

    }
    /* 
    ==> interface supports mulitple inheritance because u only have the function calls
     you don;t have the implementations. no need to worry. because when u will implement it 
    it will be imlemented once. 
    
    */
    interface ink {
        void run();
        void hello();
        void son();
        void book();
    }
// how do you implement the functions of this interfae 
    class student implements inf {

       public void run() {
            System.out.println("Running is good for health");
        }
        public void hell() {
            System.out.println("Hello World");
        }

        public void bye() {
            System.out.println("Bye thanks for using app ");

            int x = 5;
        }
     }
     public class basic {
    public static void main(String[] args) {
        

        student clg = new student();
        clg.hell();
        clg.run();
        clg.bye();

    }
    
}
