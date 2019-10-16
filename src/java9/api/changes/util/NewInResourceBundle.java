package java9.api.changes.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class NewInResourceBundle
{
  public void resourceBundle()
  {
    Module module = null;
    ResourceBundle rb = ResourceBundle.getBundle("hi", module);
    rb = ResourceBundle.getBundle("hi", Locale.CANADA, module);
  }
}
