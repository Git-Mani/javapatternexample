
public class HalfDiamond {

    public static void main(String args[]) {

        int n = 10;
        for (int i = 1; i < n; i++) {
            if (i <= 5) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {

                for (int j = n-i; j >= 1; j--) {
                    System.out.print("*");

                }

            }
            System.out.println();

        }

    }
}
