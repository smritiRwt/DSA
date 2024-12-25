public class Occurence {
    public  static  int first=-1;
    public  static  int last=-1;
    public static void main(String[] args) {

        String str="abspkoksjfijsoifosa";
        getOccurence(str, 0, 'a');
      
    }

    public static void getOccurence(String str,int index,char element){
        if(index==str.length()){
            System.out.println("First "+first);
            System.out.println("Last "+last);
            return;
        }
        char currchar=str.charAt(index);
        if(currchar==element){
            if(first==-1){
                first=index;
            }
            else{
                last=index;
            }
        }
        getOccurence(str, index+1, element);
    }
}
