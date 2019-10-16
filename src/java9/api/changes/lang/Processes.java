package java9.api.changes.lang;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.lang.ProcessHandle.Info;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class Processes
{
  public void process()
  {
    Process process = null;
    Stream<ProcessHandle> children = process.children();
    Stream<ProcessHandle> descendants = process.descendants();
    Info info = process.info();
    CompletableFuture<Process> onExit = process.onExit();
    long pid = process.pid();
    boolean supportsNormalTermination = process.supportsNormalTermination();
    ProcessHandle handle = process.toHandle();
  }

  public void processHandle()
  {
    Stream<ProcessHandle> allProcesses = ProcessHandle.allProcesses();
    ProcessHandle current = ProcessHandle.current();
    long pid = 3;
    Optional<ProcessHandle> process = ProcessHandle.of(pid);

    current.parent();
    current.children();
    current.descendants();

    current.isAlive();
    current.destroy();
    current.destroyForcibly();
    CompletableFuture<ProcessHandle> onExit = current.onExit();

    Info info = current.info();
    long pid2 = current.pid();
    boolean supportsNormalTermination = current.supportsNormalTermination();
  }

  public void info()
  {
    Info info = ProcessHandle.current().info();
    Optional<String[]> arguments = info.arguments();
    Optional<String> command = info.command();
    Optional<String> commandLine = info.commandLine();
    Optional<Instant> startInstant = info.startInstant();
    Optional<Duration> totalCpuDuration = info.totalCpuDuration();
    Optional<String> user = info.user();
  }

  public void processBuilder() throws IOException
  {
    List<ProcessBuilder> builders = null;
    ProcessBuilder.startPipeline(builders);
    Redirect discard = ProcessBuilder.Redirect.DISCARD;
  }
}
