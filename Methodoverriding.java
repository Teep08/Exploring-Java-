public class Methodoverriding {
    public static void main(String args[])
    {
        NonVeg obj = new NonVeg();
        obj.eat();
    }
}

class Veg {
    void eat(){
        System.out.println("Veg Eating");
    }
}

class NonVeg extends Veg {
    void eat() {
        System.out.println("Non-veg Eating");
    }
}

/* Output : 
 * Non-veg Eating
 */