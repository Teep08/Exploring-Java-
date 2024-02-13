public class MultipleInheritance {
    public static void main(String args[])
    {
        Beer obj = new Beer();
        obj.vegfood(); //Carnivorous interface method call
        obj.nonvegfood(); //Herbivorous interface method call
    }    
}

interface Carnivorous {
    void vegfood();
}

interface Herbivorous { 
    void nonvegfood();
}

//Implemented both base interface into the 'Beer' derived class
class Beer implements Carnivorous , Herbivorous {
    public void vegfood()
    {
        System.out.println("Fish");
    }
    public void nonvegfood()
    {
        System.out.println("carrot");
    }
}
