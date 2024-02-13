public class InterfaceinJava {

    public static void main(String args[])
    {
        Kia obj = new Kia();
        obj.name();
    }
}

//declare interface using 'interface' keyword
interface Carname {
    void name(); //Abstract method
}

//for inherit the interface we use 'implements' keyword
class Kia implements Carname {
    //while using the abstract method of interface we use public Access modifiers
    public void name()
    {
        System.out.println("Kia Seltos");
    }
}
