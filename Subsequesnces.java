
import java.util.HashSet;

public class Subsequesnces {
    public static void main(String[] args) {
        String s="aaa";
        HashSet<String> set=new HashSet<>();
        subSequencestring(s, 0, "",set);
    }

    public static void subSequencestring(String str,int index,String newString,HashSet<String> set){
        if(index==str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currentChar=str.charAt(index);
        subSequencestring(str, index+1, newString+currentChar,set);
        subSequencestring(str, index+1, newString,set);
    }
}
