public class Abstractclass {
    public static void main(String args[]){
        Google obj = new Google();
        obj.welcome();
        obj.userwebsite();
    }
}

//Abstract class 
abstract class Internet {
    //Non-Abstract method
    void welcome(){
        System.out.println("Welcome to the world of internet");
    }

    //Declare Abstract method
    abstract void userwebsite();
}

class Google extends Internet{
    //Implementation of Abstract method
    void userwebsite() {
        System.out.println("You have access the Google");
    }
}

/*
 OUTPUT :
Welcome to the world of internet
You have access the Google
 */
