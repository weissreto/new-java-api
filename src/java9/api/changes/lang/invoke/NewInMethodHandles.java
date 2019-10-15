package java9.api.changes.lang.invoke;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodType;
import java.lang.invoke.StringConcatException;
import java.lang.invoke.StringConcatFactory;
import java.lang.invoke.VarHandle;

public class NewInMethodHandles 
{
	public void stringConcatFactory() throws StringConcatException
	{
		Lookup lookup = null;
		String name = null;
		MethodType concatType =null;
		StringConcatFactory.makeConcat(lookup, name, concatType);
		
		String recipe = null;
		Object constants =null;
		StringConcatFactory.makeConcatWithConstants(lookup, name, concatType, recipe, constants);
	}
	
	public void methodHandle()
	{
		MethodHandle methodHandle = null;
		
		int collectArgPos = 0;
		Class<?> arrayType = null;
		int arrayLength = 0;
		methodHandle.asCollector(collectArgPos, arrayType, arrayLength);
		
		int spreadArgPos = 0;
		methodHandle.asSpreader(spreadArgPos, arrayType, arrayLength);
		
		boolean makeVarargs = true;
		methodHandle.withVarargs(makeVarargs);
	}
	
	public void methodHandles()
	{
		Class<?> arrayClass = null;;
		MethodHandle arrayConstructor = MethodHandles.arrayConstructor(arrayClass);
		
		VarHandle varHandle = MethodHandles.arrayElementVarHandle(arrayClass);
		
		MethodHandle arrayLength = MethodHandles.arrayLength(arrayClass);
		
		MethodHandle[] methodHandles = null;
		MethodHandle loop = MethodHandles.loop(methodHandles);
		
		MethodHandle tryMethod = null;
		MethodHandle finallyMethod = null;
		MethodHandle tryFinally = MethodHandles.tryFinally(tryMethod, finallyMethod);	
		
		// more
	}
	
	public void lookup() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException
	{
		int module = Lookup.MODULE;
		Lookup lookup = null;
		
		Class clazz = lookup.findClass(String.class.getName());
		
		byte[] content = null;
		lookup.defineClass(content);
		
		Class<?> fieldType = null;
		String fieldName = null;
		Class<?> targetClass = null;
		VarHandle staticField = lookup.findStaticVarHandle(targetClass, fieldName, fieldType);
		VarHandle field = lookup.findVarHandle(targetClass, fieldName, fieldType);
		
		// more
	}
	
	public void varHandles()
	{
		VarHandle varHandle = null;
		
		varHandle.get();
		varHandle.set("Hello");
		
		varHandle.getVolatile();
		varHandle.setVolatile("hello");

		varHandle.getOpaque();
		varHandle.setOpaque("hello");
		
		varHandle.getAcquire();
		varHandle.setRelease("hello");
		
		varHandle.compareAndSet("Hi", "Hello");
		varHandle.compareAndExchange("Hi", "Hello");
		varHandle.compareAndExchangeAcquire("Hi", "Hello");
		varHandle.compareAndExchangeRelease("Hi", "Hello");
		
		varHandle.getAndAdd(12);
		varHandle.getAndAddAcquire(12);
		varHandle.getAndAddRelease(12);
		
		varHandle.getAndBitwiseXor(12);

		VarHandle.acquireFence();
		VarHandle.releaseFence();
		
		VarHandle.loadLoadFence();
		VarHandle.storeStoreFence();
		VarHandle.fullFence();
		
		// a lot more
	}
}
