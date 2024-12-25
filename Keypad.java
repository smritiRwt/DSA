public class Keypad {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) {
        String str="4";
        kaypad(str, 0, "");
    }

    public  static void kaypad(String str,int index,String combination){
        if(index==str.length()){
System.out.println(combination);
return;
        }

        char currentIdx=str.charAt(index);
        String mapping=keypad[currentIdx-'0'];
        for(int i=0;i<mapping.length();i++){
            kaypad(str, index+1, combination+mapping.charAt(i));
        }

    }
}
