package java9.api.changes.lang;

public class Mathes
{
  public void math()
  {
    Math.floorDiv(10l, 2);
    Math.floorMod(10l, 2);
    Math.fma(12.0d, 3.0d, 1.0d);
    Math.fma(12.0, 3.0, 1.0);
    long result = Math.multiplyExact(12l, 2);
    result = Math.multiplyFull(12, 2);
    result = Math.multiplyHigh(12l, 2l);
  }
}
