package java9.api.changes.lang;

import java.lang.Runtime.Version;
import java.util.Optional;

public class Runtimes
{
  public void version()
  {
    Version version = Runtime.version();
    int feature = version.feature(); // 9
    int interim = version.interim(); // 0
    int update = version.update(); // 4
    int patch = version.patch();
    Optional<Integer> build = version.build(); // b14
    Optional<String> pre = version.pre(); // ea
    Optional<String> optional = version.optional(); // valhalla, panama, ...
  }
}
