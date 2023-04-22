import java.util.stream.*;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;


class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        double numberOfPositive = 0;
        double numberOfZero = 0;
        double numberOfNegative = 0;
        for (int value: arr) {
            if (value > 0) {
                numberOfPositive++;
            } else if (value < 0) {
                numberOfNegative++;
            } else {
                numberOfZero++;
            }
        }

        System.out.println(BigDecimal.valueOf(numberOfPositive / arr.size()).setScale(6, RoundingMode.HALF_UP));
        System.out.println(BigDecimal.valueOf(numberOfNegative / arr.size()).setScale(6, RoundingMode.HALF_UP));
        System.out.println(BigDecimal.valueOf(numberOfZero / arr.size()).setScale(6, RoundingMode.HALF_UP));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}