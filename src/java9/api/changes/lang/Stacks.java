package java9.api.changes.lang;

import java.lang.StackWalker.Option;
import java.lang.StackWalker.StackFrame;
import java.util.EnumSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stacks 
{
	public void stackTraceElement()
	{
		StackTraceElement stackTraceElement = new Exception().getStackTrace()[0];
		String classLoaderName = stackTraceElement.getClassLoaderName();
		String moduleName = stackTraceElement.getModuleName();
		String moduleVersion = stackTraceElement.getModuleVersion();
	}
	
	public void stackWalker()
	{
		StackWalker instance = StackWalker.getInstance();
		instance.forEach(frame -> frame.getMethodName());
		Class<?> callerClass = instance.getCallerClass();
		
		Function<Stream<StackFrame>, String> walker = frames -> frames
				.map(Object::toString)
				.collect(Collectors.joining("\n"));
		String stackTrace = instance.walk(walker);
		
		int estimateDepth = 15;
		StackWalker.getInstance(EnumSet.of(Option.SHOW_HIDDEN_FRAMES, Option.RETAIN_CLASS_REFERENCE), estimateDepth);
	}
	
}
