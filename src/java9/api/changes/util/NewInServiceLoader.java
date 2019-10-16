package java9.api.changes.util;

import java.util.Optional;
import java.util.ServiceLoader;
import java.util.ServiceLoader.Provider;
import java.util.stream.Stream;

public class NewInServiceLoader
{
  public void serviceLoader()
  {
    ModuleLayer layer = null;
    ServiceLoader<String> serviceLoader = ServiceLoader.load(layer , String.class);
    
    Optional<String> service = serviceLoader.findFirst();
    Stream<Provider<String>> services = serviceLoader.stream();

  }
}
