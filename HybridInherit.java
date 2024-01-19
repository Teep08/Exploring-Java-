public class Hierarchial {

    public static void main(String args[])
    {
        //In Main class we can create any derived class object , we create both derived class object
        StateInd obj = new StateInd(); 
        obj.name(); //Calling the Base class function using derived class object
        obj.ind();
        obj.state();

        StateUS obj1 = new StateUS();
        obj1.name(); //Calling the Base class function using derived class object
        obj1.us();
        obj1.stateUSA();
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

//Derived class
class USA extends Country {
    void us()
    {
        System.out.println("USA");
    }
}

//Child class of India
class StateInd extends India {
    void state()
    {
        System.out.println("Uttarakhand");
    }
}

//Child class of USA
class StateUS extends USA {
    void stateUSA()
    {
        System.out.println("Alaska");
    }
}

/* OUTPUT :
Your Country name is: 
India
State is : Uttarakhand
Your Country name is:
USA
State is : Alaska
*/