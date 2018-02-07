public class MinSumUniqNums{

  /*
   * Complete the function below.
   */
  static int getMinimumUniqueSum(int[] arr) {
    Set<Integer> known_nums = new HashSet<Integer>();
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
      while (known_nums.contains(arr[i])) {
        arr[i] += 1;
      }

      total += arr[i];
      known_nums.add(arr[i]);
    }
    return total;
  }

}