package java9.api.changes.lang;

import java.lang.module.Configuration;
import java.lang.module.ModuleDescriptor;
import java.lang.module.ModuleDescriptor.Modifier;
import java.lang.module.ModuleReference;
import java.util.Optional;
import java.util.Set;

public class Modules
{
  public void module()
  {
    Module module = null;
    module.getName();
    module.getPackages();
    // a lot more
  }

  public void layer()
  {
    ModuleLayer layer = null;
    Configuration configuration = layer.configuration();
    layer.modules();
    layer.defineModules(configuration, moduleName -> ClassLoader.getPlatformClassLoader());
    layer.parents();

    // a lot more
  }

  public void descriptor()
  {
    Module module = null;
    ModuleDescriptor descriptor = module.getDescriptor();
    descriptor.isAutomatic();
    descriptor.isOpen();
    descriptor.mainClass();
    Set<Modifier> modifiers = descriptor.modifiers();
    descriptor.name();
  }

  public void moduleFinder()
  {
    java.lang.module.ModuleFinder moduleFinder = java.lang.module.ModuleFinder.ofSystem();
    Optional<ModuleReference> module = moduleFinder.find("java.base");
    Set<ModuleReference> findAll = moduleFinder.findAll();
  }
}
