
public class HCF {

    public static void findHcf(int n1, int n2) {
        int lowernumber = 0;
        int hcf = 0;
        if (n1 < n2) {
            lowernumber = n1;
        } else {
            lowernumber = n2;
        }
        for (int i = 1; i <= lowernumber; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("Hcf: " + hcf);
    }

    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 45;
        findHcf(n1, n2);
    }

}
