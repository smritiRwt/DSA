public class Maxmin{
  public static int min=10;
  public static int max=0;
  public static int array[]={ 41,2,3,8,3};

      public static void main(String[] args){
        min=array[0];
        max=array[1];
        getMinMax1(0);
      }
  
      public static void getMinMax(int arr[]){
          for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
          }
          if(arr[i]<min){
              min=arr[i];
          }
    }
    System.out.println(max);
    System.out.println(min);
}
public static void getMinMax1(int index){
    if(index==array.length){
    System.out.println(max);
    System.out.println(min);
    return;
    }
    if(array[index]>max){
        max=array[index];
  }
  if(array[index]<min){
      min=array[index];
  }
  getMinMax1(index+1);
}


}