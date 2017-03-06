import java.util.*;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public Solution(String magazine, String note) {
        magazineMap = new HashMap<String, Integer>();
        noteMap = new HashMap<String, Integer>();
        for(String s : magazine.split(" ")){
            magazineMap.put(s, ((magazineMap.get(s) == null) ? 0 : magazineMap.get(s)) + 1 );
        }
        
        for(String s : note.split(" ")){
            noteMap.put(s, ((noteMap.get(s) == null) ? 0 : noteMap.get(s)) + 1 );
        }
    }
    
    public boolean solve() {        
        for(String s : noteMap.keySet()){
            
            if(magazineMap.get(s) != null && 
               magazineMap.get(s) >= noteMap.get(s)
              ){
                magazineMap.put(s, magazineMap.get(s) - noteMap.get(s));
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
