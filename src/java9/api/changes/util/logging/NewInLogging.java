package java9.api.changes.util.logging;

import java.io.IOException;
import java.io.InputStream;
import java.time.Instant;
import java.util.ResourceBundle;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class NewInLogging
{
  private void logger()
  {
    Logger logger = null;
    ResourceBundle bundle = null;
    logger.logrb(Level.SEVERE, bundle, "Hi {0}", "Reto");
    
    Object exception = null;
    logger.logrb(Level.WARNING, bundle, "Error", exception);
  }
  
  private void fileHandler() throws IOException
  {
    String pattern = null;
    long limit = 0l;
    int count = 0;
    boolean append = false;
    FileHandler handler = new FileHandler(pattern, limit, count, append);
  }
  
  private void logManager() throws IOException
  {
    LogManager manager = null;
    
    Runnable listener = () -> System.out.println("Changed");
    manager.addConfigurationListener(listener);
    manager.removeConfigurationListener(listener);
    
    Function<String, BiFunction<String, String, String>> mapper = null;
    manager.updateConfiguration(mapper);
    InputStream is = null;
    manager.updateConfiguration(is , mapper);
  }
  
  private void logRecord()
  {
    LogRecord record = null;
    Instant instant = record.getInstant();
    record.setInstant(instant);
  }
}
