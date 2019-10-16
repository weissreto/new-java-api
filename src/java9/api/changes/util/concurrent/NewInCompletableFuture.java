package java9.api.changes.util.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class NewInCompletableFuture
{
  public void completableFuture()
  {
    
    
    String value = null;
    CompletionStage<String> stage = CompletableFuture.completedStage(value);
    Throwable ex = null;
    CompletableFuture<Object> failedFuture = CompletableFuture.failedFuture(ex);
    
    CompletionStage<Object> failedStage = CompletableFuture.failedStage(ex);

    CompletableFuture<String> future = null;
    future.completeAsync(() -> "Hi");
    Executor executor = null;
    future.completeAsync(() -> "Hi", executor);
    
    TimeUnit unit = null;
    long timeout = 0;
    future.completeOnTimeout("Timeout", timeout, unit);

    CompletableFuture<String> copy = future.copy();
    executor = future.defaultExecutor();
    
    CompletionStage<String> minimalStage = future.minimalCompletionStage();
    CompletableFuture<Object> incompleteFuture = future.newIncompleteFuture();
    
    future.orTimeout(timeout, unit);
    
    long delay = 0;
    executor = CompletableFuture.delayedExecutor(delay, unit);
    
    executor = CompletableFuture.delayedExecutor(delay, unit, executor);
  }
}
