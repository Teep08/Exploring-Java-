public class Multilevel {
    public static void main(String args[])
    {
        Animal obj = new Animal();
        obj.food(); //Access the Base class function with derived class object
        obj.colour = "White"; //Access the derived class variable 
        obj.name = "Tommy";

        System.out.println(obj.colour +"\n"+ obj.name);
    }    
}

 //Base class
class Type {
    void food()
    {
        System.out.println("Eating...");
    } 
}

//Derived class
class Color extends Type {
    String colour;
}

//Derived class
class Animal extends Color {
    String name;
}

/*
 Output :
 Eating...
 White
 Tommy
 */
