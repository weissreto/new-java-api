package java9.api.changes.lang;

import java.net.URL;
import java.util.stream.Stream;

public class Classes
{
  public void module()
  {
    Module module = String.class.getModule();
    Class.forName(module, "java.lang.String");
  }

  public void packageName()
  {
    String.class.getPackageName();
  }

  public void classLoader()
  {
    ClassLoader cl = ClassLoader.getPlatformClassLoader();
    cl.getName();

    cl.getDefinedPackage("java.lang");
    Package[] definedPackages = cl.getDefinedPackages();

    Module unnamedModule = cl.getUnnamedModule();

    cl.isRegisteredAsParallelCapable();

    Stream<URL> resources = cl.resources("/messages");
  }

}
