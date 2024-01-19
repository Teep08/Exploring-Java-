public class Hierarchial {

    public static void main(String args[])
    {
        //In Main class we can create any derived class object , we create both derived class object
        India obj = new India(); 
        obj.name(); //Calling the Base class function using derived class object
        obj.ind();

        USA obj1 = new USA();
        obj1.name(); //Calling the Base class function using derived class object
        obj1.us();
    }
}

// Base class
class Country {
    void name()
    {
        System.out.println("Your Country name is: ");
    }
}

//Derived class
class India extends Country {
    void ind()
    {
        System.out.println("India");
    }
}

class USA extends Country {
    void us()
    {
        System.out.println("USA");
    }
}

/* OUTPUT :

Your Country name is: 
India
Your Country name is:
USA
 */