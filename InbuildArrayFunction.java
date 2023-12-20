import java.util.Arrays;            //Array inbuild package for inbuild function
import java.util.Collections;       //Collection inbuild package

public class InbuildArrayFunction {

    public static void printarr(int arr[])
    {
        for(int n:arr)
        {
            System.out.print(n+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) 
  {

    int arr1[]={5,4,1,3,2};
    Arrays.sort(arr1);  //Sorting the array in Increment order
    printarr(arr1);  //output : 1 2 3 4 5

    int arr2[]={5,4,1,3,2};
    Arrays.sort(arr2,0,3);  //Sorting the Array with given index 0 to 3 
    printarr(arr2); //output : 1 4 5 3 2

    Integer arr3[]={5,4,1,3,2};   //This array is object and the datatype is Integer because Reverse order function is work in object not in premetive datatype
    Arrays.sort(arr3,Collections.reverseOrder());  //Sorting the Array in Decrement order
    for(Integer n : arr3)
    {
        System.out.print(n+" ");    //output : 5 4 3 2 1
    }
    System.out.println();

    Integer arr4[]={5,4,1,3,2};   //This array is object and the datatype is Integer because Reverse order function is work in object not in premetive datatype
    Arrays.sort(arr3,0,3,Collections.reverseOrder());  //Sorting the Array in Decrement order
    for(Integer n : arr4)
    {
        System.out.print(n+" ");    //output : 5 4 1 3 2
    }
   
  }
}
