import java.util.HashMap;
import java.util.Set;

class Solution {
  public int solution(int N) {
    String num = N + "";
    HashMap numCounts = new HashMap<Character, Integer>();
    int result = 0, length = num.length();
    boolean isUnique = true;

    for(char c : num.toCharArray()){
      if(numCounts.containsKey(c)){
        isUnique = isUnique && false;
        numCounts.put(c, (int) numCounts.get(c) + 1);
      } else {
        numCounts.put(c, 1);
      }
    }

    // N! if all unique
    if(isUnique){
      return factorial(length);
    } else if (numCounts.containsKey('0')){
      // if 0 exists, zero_count
      //     (N-zero_count).(N-zero_count)!
      result = length - ((int) numCounts.get('0'));
      result *= factorial(length - 1);
    } else {
      // if repeatations
      //     N!/(n1!*n2!*n3!..)
      result = factorial(length);
    }

    // consider repeatations
    // if repeatations
    //     N!/(n1!*n2!*n3!..)
    Object[] numKeys = numCounts.keySet().toArray();

    for(int i = 0; i < numKeys.length; i++) {
      if(result == 1) break;
      int repeats = (int) numCounts.get((char) numKeys[i]);
      result = result/(factorial(repeats));
    };

    return result;
  }

  public int factorial(int n){
    if(n <= 1) return 1;
    return n * factorial(n-1);
  }
}