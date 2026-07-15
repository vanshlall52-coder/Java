public class ChainingOfFunction {
    public static void main(String[] args){
        Fun1();
        System.out.println("Bye");
    }
    // Function chaining in java
    static void Fun1(){
        Fun2();// Calling the 2nd function
        System.out.println("Hi");
    }

    static void Fun2(){
        Fun3();// Calling the 3rd function
        System.out.println("Hello");
    }

    static void Fun3(){
        System.out.println("Welcome");
    }
}