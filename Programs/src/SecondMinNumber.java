public class SecondMinNumber {
    
  public static void main(String[] args){
     int arr[] = {5,3,34,56,23,3,56,1,4,4};
    int result = findSecMinNumber(arr);
    System.out.println(result);
  }
  
  public static int findSecMinNumber(int[] arr){
      int min=arr[0], secMin =arr[0];
      
    for(int i=0; i<arr.length; i++){
      if(arr[i]< min){
          secMin= min;
          min = arr[i];
      }  
    }
    return secMin;
  }
  
}
