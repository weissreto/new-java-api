package java9.api.changes.lang;

public class Annotations
{
  public void deprecated()
  {
    Deprecated deprecated = null;

    deprecated.forRemoval();
    deprecated.since();
  }
}
