import java.util.*;

class Solution {
  int solution(int[] A) {
    int N = A.length;
    int result = 0;
    for (int i = 0; i < N; i++) {
      for (int j = N - 1; j >= 0; j--) {
        if (A[i] != A[j] && result != Math.max(result, j - i)) {
          result = Math.max(result, j - i);
          // System.out.println("i " + A[i] + " j " + A[j]+ " result " + result);
          break;
        }
      }
      if (result > N - i) {
        break;
      }
    }

    return result;
  }
}
// Elon