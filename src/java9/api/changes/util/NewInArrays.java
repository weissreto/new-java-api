package java9.api.changes.util;

import java.util.Arrays;
import java.util.Comparator;

public class NewInArrays
{
  public void arrays()
  {
    String[] a = null, b = null;
    
    int result = Arrays.compare(a, b);
    boolean equals = Arrays.equals(a, b);
    int firstMismatchPos = Arrays.mismatch(a, b);

    int aFromIndex = 0;
    int aToIndex = 0;
    int bFromIndex = 0;
    int bToIndex = 0;
    result = Arrays.compare(a, aFromIndex, aToIndex, b, bFromIndex, bToIndex);    
    equals = Arrays.equals(a, aFromIndex, aToIndex, b, bFromIndex, bToIndex);
    firstMismatchPos = Arrays.mismatch(a, aFromIndex, aToIndex, b, bFromIndex, bToIndex);
    
    Comparator comparator = null;
    result = Arrays.compare(a, b, comparator);
    equals = Arrays.equals(a, b, comparator);
    firstMismatchPos = Arrays.mismatch(a, b, comparator);
    
    result = Arrays.compare(a, aFromIndex, aToIndex, b, bFromIndex, bToIndex, comparator);
    equals = Arrays.equals(a, aFromIndex, aToIndex, b, bFromIndex, bToIndex, comparator);
    firstMismatchPos = Arrays.mismatch(a, aFromIndex, aToIndex, b, bFromIndex, bToIndex, comparator);

    byte[] ia = null;
    byte[] ib = null;
    Arrays.compareUnsigned(ia, ib);
    
    // all the same  for boolean[], byte[], short[] ...

    
  }
}
