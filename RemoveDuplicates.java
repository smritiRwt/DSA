public class RemoveDuplicates {
    public  static  boolean [] map=new boolean[26];

    public static void main(String[] args) {
        String str="abbccda";
        removeDuplicates(str, 0, "");
    }

    public  static void removeDuplicates(String str,int index,String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar=str.charAt(index);
        if(map[currentChar-'a']){
            removeDuplicates(str, index+1, newString);
        }else{
            newString+=currentChar;
            map[currentChar-'a']=true;
            removeDuplicates(str, index+1, newString);
        }
    }
}
