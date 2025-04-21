public class APLine
{
  /* your code here */
  private int a, b, c;
  public APLine(int uA, int uB, int uC) {
    a = uA;
    b = uB;
    c = uC;
  }
  public double getSlope() {
    double slope = -a/b;
    return slope;
  }
  public boolean isOnLine(int x, int y) {
    if(x*a + y*b + c == 0) {
      return true;
    }
    return false;
  }
}
