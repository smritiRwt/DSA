
public class ReverseArray {

    public static int[] newarray = new int[5];

    public static void main(String[] args) {
        int array[] = {1, 10, 20, 11, 25};
        reverseArray(array);
    }

    public static void reverseArray(int array[]) {
        // int counter=0;
        // for(int i=array.length-1;i>=0;i--){
        //     newarray[counter]=array[i];
        //     counter++;
        // }
        int temp;
        //big o
        //omega
        //theta
        for (int i = 0; i <= (array.length) / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int j = 0; j < newarray.length; j++) {
            System.out.println(array[j]);
        }
    }
}
