public class Constructor {
    public static void main(String args[])
    {
        //Non-parameterized Constructor 
        Pen p = new Pen(); 

        //Parameterized Constructor
        Pen p1 = new Pen("Gel pen"); 

        //Passing parameters to copy Constructor
        Pen p3 = new Pen(p1);
        System.out.println(p3.getname());
    }    
}

class Pen {
    private String name;
    
    Pen()
    {
        System.out.println("It's Non Perameterised constructor");
    }

    //creating a copy constructor  
    Pen(Pen p1)
    {
        this.name = p1.name;
    }

    String getname() //Getter
    {
        return name;
    }

    Pen(String name)
    {
        this.name = name;
        System.out.println(name);
    }
}

/*
OUTPUT : 
It's Non Perameterised constructor
Gel pen
Gel pen
 */