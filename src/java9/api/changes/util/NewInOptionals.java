package java9.api.changes.util;

import java.util.Objects;
import java.util.Optional;

public class NewInOptionals
{
  public void optional()
  {
    Optional<String> optional = null;
    
    optional.ifPresentOrElse(str -> System.out.println(str), () ->System.err.println("No String, Sorry!"));
    optional.or(() -> Optional.of("No String, Sorry!"));
    optional
        .stream()
        .filter(str -> Objects.equals(str, "Hi"))
        .map(str -> "Hi "+str)
        .findAny()
        .get();
  }
}
