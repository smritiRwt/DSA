package StringQuestions;

public class String2 {

    public static void main(String[] args) {
        int i = 0;
        String str = "i NAME is SMRITI";
        char[] chars = str.toCharArray();
        while (i < chars.length) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32);
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
            i++;
        }
        str = new String(chars);
        System.out.print(str);
    }
}
