public class Super {
    public static void main(String args[])
    {
        Dog obj = new Dog();
        obj.dog();
    }
}

class Animal{
    String type;
}

class Dog extends Animal {
    void dog()
    {
        //using super keyword we are access "type" variable of Animal class
        super.type = "Dog";
        System.out.println(type);
    }
}

// OUTPUT : Dog
