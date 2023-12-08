public class Linearsearch {
    
   // Function for linear search and return true if number found
   public static boolean search(int arr[],int find) {
    for(int i=0;i<arr.length;i++) {
       if(arr[i]==find) {
          return true;
       }
    }
    return false;
 }
 public static void main(String args[]) {
    int arr[] = {2,7,3,99,13,6,9,60,71};   //Array
    int find = 60;  //Search number
    boolean result = search(arr, find);    //Declaring a boolean variable and calling the search function

    //Comparing result
    if(result==true) {
       System.out.println("Number is present");
    }
    else {
       System.out.println("Number is not present");
    }
    
 }
}
