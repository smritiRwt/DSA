public class MoveAtEndRecursion {
    //Place element at last of the string
    public static void main(String[] args) {
        String s="axbcxxxh";
        moveElementAtend(s,0,0,"");
    }

    public static void moveElementAtend(String str,int index,int count,String newstring){
        if(index==str.length()){
            for (int i = 0; i < count; i++) {
                newstring+='x';
            }     
            System.out.println(newstring);
            return;
        }
        char currchar=str.charAt(index);
        if(currchar=='x'){
            count++;
            moveElementAtend(str, index+1, count, newstring);
        }else{
            newstring+=currchar;
            moveElementAtend(str, index+1, count, newstring);
        }
    }
}
