package java9.api.changes.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewInStreams
{
  public void collectors()
  {
    List<String> result = List.of();
    result = result.stream().collect(
            Collectors.filtering(str -> str.startsWith("Hi"), Collectors.toList()));
    
    List<List<String>> strings = List.of();
    result = strings.stream().collect(
            Collectors.flatMapping(strs -> strs.stream(), Collectors.toList()));
  }
  
  public void streams()
  {
    Stream<String> stream = null;
    
    stream.dropWhile(str -> str.startsWith("Hi"));
    stream.takeWhile(str -> str.startsWith("Hi"));
    
    stream = Stream.ofNullable("String");
    stream = Stream.iterate("Hi", str -> str.length() < 100, str -> str + "Hi");
  }

}
