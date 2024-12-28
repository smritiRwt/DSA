
public class LCM {

    public static void findLcm(int n1, int n2) {
        int greaterNumber = Math.max(n1, n2);
        int lcm = greaterNumber;
        while (lcm % n1 != 0 || lcm % n2 != 0) {
            lcm++;
        }
        System.out.println("LCM: " + lcm);
    }

    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 30;
        findLcm(n1, n2);
    }

}
