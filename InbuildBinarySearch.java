import java.util.Arrays;

public class InbuildBinarySearch {
    public static void sort(int arr[],int key)
    {   
        Arrays.sort(arr);   //Sorting the array
        int found =Arrays.binarySearch(arr,key);    //searching an element using Binary search and store the location in found variable
        if( found >=0) {    //If element not present in our array then Arrays.binarySearch throw the negative values 
            System.out.println("Element found at :"+found);
        }
        else {
            System.out.println("Element not in the Array");
        }
    }

    public static void main(String args[]) {
        int arr[]={2,6,4,3,7,9,8,1};
        int key=8;  //searching element 
        sort(arr,key);  //calling the function
    }
}
