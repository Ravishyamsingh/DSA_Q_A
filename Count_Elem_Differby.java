import java.util.Arrays;

public class CountElementDifferenceLongWay {

    public static void main(String[] args) {

        // Step 1: Declare and initialize first array
        int[] firstArray = {10, 11, 10, 20, 43, 20, 50};

        // Step 2: Declare and initialize second array
        int[] secondArray = {10, 13, 11, 20, 44, 30, 50};

        // Step 3: Print both arrays
        System.out.println("Array 1: " + Arrays.toString(firstArray));
        System.out.println("Array 2: " + Arrays.toString(secondArray));

        // Step 4: Initialize counter variable
        int count = 0;

        // Step 5: Loop through both arrays
        for (int index = 0; index < firstArray.length; index++) {

            int valueFromArray1 = firstArray[index];
            int valueFromArray2 = secondArray[index];

            // Step 6: Calculate absolute difference
            int difference = Math.abs(valueFromArray1 - valueFromArray2);

            // Step 7: Check conditions
            if (difference <= 1 && valueFromArray1 != valueFromArray2) {
                count = count + 1;
            }
        }

        // Step 8: Print final result
        System.out.println("Number of elements with difference <= 1 (but not equal): " + count);
    }
}
