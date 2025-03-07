public class unique3num {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4};
        int count = 0;

        System.out.println("Unique three-digit numbers using 1, 2, 3, 4 are:");
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && j != k && i != k) {
                        System.out.println("" + digits[i] + digits[j] + digits[k]);
                        count++;
                    }
                }
            }
        }

        System.out.println("Total number of unique three-digit numbers: " + count);
    }
}
