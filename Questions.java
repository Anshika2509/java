// 1st questions classes **************

import java.util.prefs.PreferenceChangeEvent;
import java.util.zip.CheckedInputStream;

class Base{
    static void display(){
        System.out.println("Base Display");
    }
}

class Derived extends Base{
    // This is method hiding and not method overriding because method is static
    static void display(){
        System.out.println("Derived Display");
    }
}

//***********************************************

// 2nd question classes *************************

class Animal{
    Animal(){
        System.out.println("Animal is created");
    }
}

class Dog extends Animal{
    Dog(){
        System.out.println("Dog is created");
    }
}

//***********************************************

// 3rd question classes *************************
class A{
    String s = "Class A";
}
class B extends A{
    String s = "Class B";
    void Display(){
        System.out.println(s);
        System.out.println(super.s);
    }
}

//***********************************************

// 4rth question classes *************************
class A4{
    public A4(){
        System.out.println("It's A4");
    }
}
class B4 extends A4{
    public B4(){
        System.out.println("It's B4");
    }
}
class C4 extends B4{
    public C4(){
        System.out.println("It's C4");
    }
}

//***********************************************

// 5th question classes *************************
class Animal5 {
    String name = "Animal5";
    void eat() {
        System.out.println("Animal5 eats");
    }
}

class Dog5 extends Animal5 {
    String name = "Dog5";
    void bark() {
        System.out.println("Dog5 barks");
    }
}

//***********************************************

// 8th question classes *************************
class A8{
    {
        System.out.println("A8");
    }
}
class B8 extends A8{
    {
        System.out.println("B8");
    }
}
class C8 extends B8{
    {
        System.out.println("C8");
    }
}

//***********************************************

// 9th question classes *************************
class A9{
    static{
        System.out.println("A9");
    }
}
class B9 extends A9{
    static{
        System.out.println("B9");
    }
}
class C9 extends B9{
    static{
        System.out.println("C9");
    }
}

//***********************************************

// 10th question classes *************************
class ParentClass{
    static{
        System.out.println("ParentClass-A");
    }
    {
        System.out.println("ParentClass-B");
    }
    public ParentClass(){
        System.out.println("ParentClass-C");
    }
}

class ChildClass extends ParentClass{
    static{
        System.out.println("ChildClass-A");
    }
    {
        System.out.println("ChildClass-B");
    }
    public ChildClass(){
        System.out.println("ChildClass-C");
    }
} 

//***********************************************

// 11th question classes *************************
class Parent{
    private void print(){
        System.out.println("Parent");
    }

    public void display(){
        print();
    }
}

class Child extends Parent{
    public void print(){
        System.out.println("Child");
    }
}


//***********************************************

// 13th question classes *************************
class Base13{
    void print(){
        System.out.println("Base Method-13");
    }
}
class Derived13 extends Base13{
    @Override
    void print(){
        super.print();
        System.out.println("Derived Method-13");
    }
}

//***********************************************

// 14th question classes *************************
abstract class Writer{
    public static void write(){
        System.out.println("Writing...");
    }
}
class Author extends Writer{
    public static void write(){
        System.out.println("Writing Book");
    }
}
class Programmer extends Writer{
    public static void write(){
        System.out.println("Writing Code");
    }
}

public class Questions {
    //***********************************************

    // 6th question classes *************************
    public void print(Integer i){
            System.out.println("Integer");
    }

    public void print(int i){
        System.out.println("int");
    }

    public void print(long i){
        System.out.println("long");
    }

    public void print(int... i){
        System.out.println("int...");
    }


    //***********************************************

    // 7th question classes *************************

    
    //static block is executed once when the java program is loaded by JVM before the main method is called

    static
    {
        System.out.println("*************7th question *************");
    }
    static
    {
        System.out.println("1");
    }

    static
    {
        System.out.println(2);
    }

    static
    {
        System.out.println(3);
    }

    public static void main(String[] args) {
        
        // 1st question **********************
        System.out.println("*************1st question *************");
        Base b = new Derived();
        b.display();    

        // This would print Base class display even though object type is of Drrived class. Because, display is a static method and can't be overridden
        // Static methods are resolved during compile time based on reference type and not compile type.
        //Thus, display() is static and compiler binds it to Base.display()

        //***********************************************

        // 2nd question *********************************
        System.out.println("\n*************2nd question *************");
        Dog d = new Dog();

        // When object of sub class is initiated, constructor of super class is called first.
        //So, outpt would be first from Animal class and then from Dog class
        // Java automatically inserts a call to the parent class constructor (super()) as first statement if you don't automatically calls it.
        // Super class constructor can't be called after sub class constructor

        //***********************************************

        // 3rd question *********************************
        System.out.println("\n*************3rd question *************");
        B objB = new B();
        objB.Display();
        // Instance variables are not overridden.
        // The variable 's' in class B hides the variable 's' in class A.
        // 's' (or this.s) refers to B's variable, while 'super.s' refers to A's variable.

        //***********************************************

        // 4rth question *********************************
        System.out.println("\n*************4rth question *************");
        B4 b4 = new C4();

        // Object created for C4 (object type), which calls it's super class constructor - B4 which calls it's super class constructor A4. 
        // Thus, print sequence becomes - A4 -> B4 -> C4

        // Note: The reference type (B4) does not affect which constructors are called;
        // it only determines which members can be accessed through the reference.

        //***********************************************

        // 5th question *********************************
        System.out.println("\n*************5th question *************");

        Animal5 a = new Dog5();

        a.eat();      // ✅
       // a.bark();     // ❌ Compile-time error

       // Method being called from claases depend on reference type (Here not talking about overridden methods - they use object type)

       System.out.println(a.name);

       //And same for instance variables - they also depend on reference type

       //***********************************************

        // 6th question *********************************
        System.out.println("\n*************6th question *************");

        new Questions().print(10);  // gives int
        new Questions().print(12345679109l);    // gives long
        new Questions().print((Integer)10);    //gives Integer
        new Questions().print(1,2,4,3);   // multiple ints = int...   called varargs)
        new Questions().print();    // gives int... because varargs can take 0 args as well
        
        //***********************************************

        // 8th question *********************************
        System.out.println("\n*************8th question *************");
        C8 c8 = new C8();

        //***********************************************

        // 9th question *********************************
        System.out.println("\n*************9th question *************");
        C9 c9 = new C9();
        
        // 10th question *********************************
        System.out.println("\n*************10th question *************");
        ChildClass ch = new ChildClass();
        // First, static blocks of both Parent Class and Child Class will execute, and then block and constructor of parent class and lastly block and constructor of child class

        //***********************************************

        // 11th question *********************************
        System.out.println("\n*************11th question *************");
        Child child = new Child();
        child.display();

        //display is not overridden, to Java executes it from Parent Class.
        // display method in Parent can acess it's private method
        // print method in Child doesn't overrides the one in Parent, because private methods are not overridden

        //***********************************************

        // 12th question *********************************
        System.out.println("\n*************12th question *************");
        invokeMethod(null);

        // During overload resolution, null is compatible with both Object and String.
        // Since String is a subclass of Object, it is the more specific type.
        // Therefore, the compiler selects invokeMethod(String).
        //If there are multiple unrelated reference types, the call is ambiguous, resulting in a compile-time error. - EX: overloaded functions excepting String and Integer: invokeMethod(null) -> compile time error

        //***********************************************

        // 13th question *********************************
        System.out.println("\n*************13th question *************");
        Derived13 obj13 = new Derived13();
        obj13.print();
        // overridden print method in Derived calls super.print() first in it. Thus, output - Base Method-13 -> Derived Method-13 

        //***********************************************

        // 14th question *********************************
        System.out.println("\n*************14th question *************");
        Writer w = new Programmer();
        w.write();
        // Static methods are not overridden, Writer w binds to reference type (Writer) at compile time. thus, w.writer executes the Writer method
        
        }

    //***********************************************

    // 12th question classes *************************
    public static void invokeMethod(Object obj){
        System.out.println("Object Method");
    }
    public static void invokeMethod(String str){
        System.out.println("String method");
    }
}
