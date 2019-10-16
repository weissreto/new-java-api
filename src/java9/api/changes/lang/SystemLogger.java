package java9.api.changes.lang;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ResourceBundle;

public class SystemLogger
{
  public void logger()
  {
    Logger logger = System.getLogger("hi");

    ResourceBundle bundle = null;
    
    logger = System.getLogger("hi", bundle);

    logger.getName();
    logger.isLoggable(Level.ERROR);
    logger.log(Level.WARNING, "Hi");
    logger.log(Level.INFO, () -> "Hi");
    logger.log(Level.DEBUG, "hi {0}", "Reto");
    logger.log(Level.TRACE, "bad", new Exception());
    // more
  }
}
