public class RoyalNames{
  private String alphas = "abcdefghijklmnopqrstuvwxyz";
  int total = 0;

  private enum Roman {
    I(1), V(5), X(10), L(50);
    private int value;

    private Roman(int val) {
      this.val = val;
    }
  }

  Roman current = null, next = null;

  /*
   * Complete the function below.
   */
  static String[] getSortedList(String[] names) {
    Arrays.sort(names);
    for (String name : names) {
      System.out.println(name);
    }

    return names;
  }

  public static int romanToInt(String s){
    try{
      for(int curPos = 0; curPos < s.length(); curPos++){
        current = Roman.valueOf(s.substring(curPos, curPos+1));
        if(curPos+2 <= s.length()){
          next = Roman.valueOf(s.substring(curPos+1, curPos+2));
        }

        if(next != null && current.value < next.value){
          total -= current.value;
        } else {
          total += current.value;
        }
      }
      return total;
    } catch(Exception e){
      return 0;
    }
  }

  Arrays.sort(s, new Comparator<String>(){
    @override
    public int compare(String a, String b){
      a = a.toLowerCase();
      b = b.toLowerCase();
      int a_pos = 0, b_pos = 0;
      for(int i = 0; i < Math.min(a.split(" ")[0], b.split(" ")[0]); i++){
      a_pos = alphas.indexOf(a.charAt(i));
      b_pos = alphas.indexOf(b.charAt(i));

      if(a_pos != b_pos){
        break;
      }
      }

      // same first name letters
      if(a_pos == b_pos){
      // phil I, philli I
      if(a.split(" ")[0].length() != b.split(" ")[0].length()){
        return a.length() - b.length();
      } else {
        // same first name
        return romanToInt(a.split(" ")[1]) - romanToInt(b.split(" ")[1]);
      }

      }

      return (a_pos - b_pos);
    }
  })

}