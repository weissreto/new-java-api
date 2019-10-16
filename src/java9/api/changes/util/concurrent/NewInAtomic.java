package java9.api.changes.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;

public class NewInAtomic
{
  public void atomic()
  {
    // Similar to VarHandle methods
    AtomicReference<String> reference = null;
    
    String expectedValue = null;
    String newValue = null;
    reference.compareAndExchange(expectedValue, newValue);
    reference.compareAndExchangeAcquire(expectedValue, newValue);
    reference.compareAndExchangeRelease(expectedValue, newValue);
    reference.compareAndSet(expectedValue, newValue);
    reference.weakCompareAndSetAcquire(expectedValue, newValue);
    reference.weakCompareAndSetPlain(expectedValue, newValue);
    reference.weakCompareAndSetRelease(expectedValue, newValue);
    reference.weakCompareAndSetVolatile(expectedValue, newValue);
    
    reference.getAcquire();
    reference.getOpaque();
    reference.getPlain();
    reference.setRelease(newValue);
    reference.setOpaque(newValue);
    reference.setPlain(newValue);
    
    // same for AtomicBoolean, AtomicInteger, AtomicIntegerArray, AtomicLong, AtomicLongArray, AtomicReferenceArray, 
  }
}
