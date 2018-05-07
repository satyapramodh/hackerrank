import java.util.*;

class Solution {
  public int solution(String A, String B) {
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    int count = 0;
    for(char c : A.toCharArray()){
      if(!map.containsKey(c))
        map.put(c,0);
      map.put(c, map.get(c) + 1);
    }

    for (char c : B.toCharArray()) {
      if (!map.containsKey(c))
        map.put(c, 0);
      map.put(c, map.get(c) - 1);
    }

    Set keys = map.entrySet();
    for(Object c : keys){
      count += Math.abs(map.get(c.toString().charAt(0)));
    }

    return count;
  }
}