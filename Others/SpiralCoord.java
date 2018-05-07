class Solution {
  public int solution(int X, int Y) {
    // defaults
    if (X == Y && X == 0) {
      return 0;
    } else if (X == 1 && Y == 0) {
      return 1;
    }
    // get circle num
    int circleNum = Math.max(Math.abs(X), Math.abs(Y));
    int result = 0;

    // positions until the previous circles
    int temp = circleNum - 1;
    while (temp >= 0) {
      result += 8 * temp;
      temp--;
    }

    // the position of element in the current circle
    int count = 1;

    // System.out.println("result " + result);
    // init positions
    int current_x = -(circleNum - 1), current_y = circleNum;

    // count position in circle
    while (current_x != X || current_y != Y) {
      // System.out.println("Moving current_x " + current_x + " current_y " + current_y);
      if (current_x < current_y && current_x != -circleNum) { // top
        current_x++;
      } else if (current_x == circleNum && current_x > 0 && current_y > -circleNum) { // right
        current_y--;
      } else if (current_y == -circleNum && current_x > -circleNum) { // bottom
        current_x--;
      } else if (current_x == -circleNum && current_y < circleNum + 1) { // left
        current_y++;
      } else {
        break;
      }
      count++;
      // System.out.println("to current_x " + current_x + " current_y " + current_y);

    }
    // System.out.println("count " + count);

    return result + count;

  }
}