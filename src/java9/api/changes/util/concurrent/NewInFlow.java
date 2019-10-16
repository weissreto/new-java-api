package java9.api.changes.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;
import java.util.function.BiPredicate;

public class NewInFlow
{
  private void flow()
  {
    int defaultBufferSize = Flow.defaultBufferSize();
  }
  
  private void publisherSubscriber()
  {
    Publisher<String> publisher = null;
    Subscriber<String> subscriber = null;
    publisher.subscribe(subscriber);
    
    subscriber.onComplete();
    
    Throwable throwable = null;
    subscriber.onError(throwable);
    
    String item = null;
    subscriber.onNext(item );
    
    Subscription subscription = null;
    subscriber.onSubscribe(subscription);
  }
  
  private void submissionPublisher()
  {
    SubmissionPublisher<String> subPub = new SubmissionPublisher<>();
    int maxBufferCapacity = 0;
    Executor executor = null;
    subPub = new SubmissionPublisher<>(executor, maxBufferCapacity);
    subPub = new SubmissionPublisher<>(executor, maxBufferCapacity, (subscriber, error) -> System.out.println(subscriber));
    
    subPub.close();
    subPub.isClosed();
    
    Throwable error = null;
    subPub.closeExceptionally(error);
    Throwable closedException = subPub.getClosedException();
    
    subPub.consume(str -> System.out.println(str));
    
    int estimateMaximumLag = subPub.estimateMaximumLag();
    long estimateMinimumDemand = subPub.estimateMinimumDemand();
    maxBufferCapacity = subPub.getMaxBufferCapacity();
    executor = subPub.getExecutor();
    
    boolean hasSubscribers = subPub.hasSubscribers();
    
    BiPredicate<Subscriber<? super String>, ? super String> onDrop = (subscriber, item) -> { System.out.println("Dropped "+item); return true; };
    String item = null;
    subPub.offer(item , onDrop);
    
    long timeout = 0;
    TimeUnit unit = null;
    subPub.offer(item, timeout, unit, onDrop);
    
    subPub.submit(item);
    
    Subscriber<String> subscriber = null;
    subPub.subscribe(subscriber);
  }
  
}
