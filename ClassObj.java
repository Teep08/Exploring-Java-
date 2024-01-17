public class ClassObj {
    public static void main(String args[])
    {
        // stu is the Object and Student() is Constructor
        Student stu = new Student(); 

        //We have called and passed the value in the update method using class object
        stu.update("Deepak", 8);

        //using Student class variables using class object
        System.out.println("Student name: "+ stu.name);
        System.out.println("Roll number: "+stu.rollno);
    }    
}

class Student {
    int rollno;
    String name;

    void update(String name , int rollno)
    {
        this.name = name;
        this.rollno = rollno;
    }
}
