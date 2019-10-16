package java9.api.changes.util;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NewInCollections
{
  public void list()
  {
    List<String> result;
    result = List.of();
    result = List.of("Hi");
    result = List.of("Hi", "World");
    result = List.of("Hi", "World", "gugus");
    result = List.of("Hi", "World", "gugus", "blah");
    // more
    
    // same for Set
  }
  
  public void map()
  {
    Map<String, Integer> result;
    Entry<String, Integer> reto = Map.entry("Reto", 72);
    result = Map.of();
    result = Map.of("Reto", 72);
    result = Map.of("Reto", 72, "Sonja", 71);
    result = Map.of("Reto", 72, "Sonja", 71, "Rafaela", 01);
    result = Map.of("Reto", 72, "Sonja", 71, "Rafaela", 01, "Cedric", 03);
    
    result = Map.ofEntries(Map.entry("Reto", 72), Map.entry("Sonja", 71), Map.entry("Rafaela", 01));
  }
  
  public void arrayDeque()
  {
    ArrayDeque<String> deque = null;
    Collection<String> c = null;
    
    deque.addAll(c);
    deque.forEach(str -> str.toUpperCase());
    deque.removeAll(c);
    deque.removeIf(str -> str.equals("Hi"));
    deque.retainAll(c);
    
    // same for ArrayBlockingQueue, ConcurrentLinkedDeque, ConcurrentLinkedQueue
  }
  
  public void deque()
  {
    Deque<String> deque = null;
    Collection<String> c = null;
    
    deque.addAll(c);
  }
      
  public void enumeration()
  {
    Enumeration<String> enumeration = null;
    Iterator<String> iterator = enumeration.asIterator();
  }
}
