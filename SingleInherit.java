public class SingleInherit {
    public static void main(String args[])
    {
        Cat obj = new Cat();
        obj.eat(); //Calling eat function with Derived class object
        obj.run();
    }
}

//Base class
class Food {
    void eat() {
        System.out.println("Eating...");
    }
}

//Derived class
class Cat extends Food
{
    void run()
    {
        System.out.println("Cat is running");
    }
}
