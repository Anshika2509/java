// 1st questions classes **************
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

public class Questions {
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

    }
}
