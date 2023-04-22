package median;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

  /*
   * Complete the 'findMedian' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  public static int findMedian(List<Integer> arr) {
    // Write your code here
    // for (int i = 0; i < arr.size(); i++) {
    //   for (int j = i + 1; j < arr.size(); j++) {
    //     swap(arr, i, j);
    //   }
    // }
    Collections.sort(arr);

    System.out.println(arr.get(arr.size() / 2));
    return arr.get(arr.size() / 2);
  }

  public static void swap(List<Integer> arr, int idxA, int idxB) {
    int aValue = arr.get(idxA);
    int bValue = arr.get(idxB);
    if (aValue > bValue) {
      int temp = arr.get(idxA);
      arr.set(idxA, bValue);
      arr.set(idxB, temp);
    }
  }

}

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    int result = Result.findMedian(arr);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}