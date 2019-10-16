package java9.api.changes.lang.ref;

import java.lang.ref.Cleaner;
import java.lang.ref.Cleaner.Cleanable;

public class Cleaners
{
  public void cleaner()
  {
    Object cache = new Object();

    // Use instead of deprecated Object.finialize
    Cleanable cleanable = Cleaner.create().register(cache, () -> cleanUpCache());

    System.gc();
    // or
    cleanable.clean();
  }

  private void cleanUpCache()
  {
  }
}
