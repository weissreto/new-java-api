package java9.api.changes.util;

import java.util.Objects;

public class NewInObjects
{
  public void objects()
  {
    int fromIndex = 0;
    int size = 0;
    int length = 0;
    fromIndex = Objects.checkFromIndexSize(fromIndex, size, length); // throws out of bound exception
    
    int toIndex = 0;
    fromIndex = Objects.checkFromToIndex(fromIndex, toIndex , length); // throws out of bound exception
    
    int index = 0;
    index = Objects.checkIndex(index, length); // throws out of bound exception
    
    Object object = null;
    Object defaultObject = null;
    Object resultObj = Objects.requireNonNullElse(object, defaultObject);
    
    resultObj = Objects.requireNonNullElseGet(object, () -> defaultObject);
  }
}
