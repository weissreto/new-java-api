package java9.api.changes.util.concurrent;

import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class NewInTimeUnit
{
  private void timeUnit()
  {
    ChronoUnit chronoUnit = ChronoUnit.DAYS;
    TimeUnit timeUnit = TimeUnit.of(chronoUnit);
    chronoUnit = timeUnit.toChronoUnit();
  }
}
