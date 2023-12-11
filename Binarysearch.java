public class Binarysearch {
    
    
   public static boolean check(int arr[],int found)
   {
      int start=0;
      int end=arr.length-1;
      while(start<=end)           // if start and end equals or start smaller then end then loop terminate
      {
         int mid = (start+end)/2;
         if(arr[mid]==found){     // if mid value is equals to search number then it will return true 
            return true;
         }
         if(arr[mid]<found)      // if mid value of loop is smaller then search number then it will change the start point and pick the right side array
         {
            start=mid+1;
         }
         if(arr[mid]>found)      // if mid value of loop is smaller then search number then it will change the start point and pick the left side array
         {
            end=mid-1;
         }
      }
      return false;              // if start equal to end or smaller then end and mid is not eual to searched number then it will return false 
   }
   public static void main(String args[]) {
      int arr[]={2,3,4,6,7,10,19};
      int found = 5;
      System.out.println(check(arr, found));
   }
}

// OUTPUT : false
    

