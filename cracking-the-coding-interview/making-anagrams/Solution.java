import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
      Map<String, Integer> alphaMap = new HashMap<String, Integer>();
      String[] tmp = first.split("");
      for(int i=0; i<tmp.length; i++){
          alphaMap.put(tmp[i], (alphaMap.get(tmp[i]) == null ? 0 : alphaMap.get(tmp[i])) + 1);
      }
        
      tmp = second.split("");
      for(int i=0; i<tmp.length; i++){
          alphaMap.put(tmp[i], (alphaMap.get(tmp[i]) == null ? 0 : alphaMap.get(tmp[i])) - 1);
      }
      
      int count = 0;
        
      for ( String key : alphaMap.keySet() ) {
        count += Math.abs(alphaMap.get(key));
      }
      return count;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
