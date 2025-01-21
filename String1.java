package StringQuestions;

public class String1 {
    // public static void main(String[] args) {
    //     String str="hi";
    //     System.out.print(str.toUpperCase());
    // }
    public static void main(String[] args) {
        String str = "hi";
        System.out.println();
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            int asciiValue = (int) str.charAt(i) - 32;
            char c = (char) asciiValue;
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
