package java9.api.changes.lang;

public class Threads
{
  private volatile boolean eventNotificationNotReceived = true;

  public void constructor()
  {
    ThreadGroup th = null;
    long stackSize = 512_000;
    boolean inheritThreadLocals = false;
    Thread thread = new Thread(
            th,
            () -> System.out.print("Hello"),
            "Printer",
            stackSize,
            inheritThreadLocals);
  }

  public void onSpinWait()
  {
    while (eventNotificationNotReceived)
    {
      Thread.onSpinWait();
    }
  }
}
