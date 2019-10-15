package java9.api.changes.lang.reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;

public class Accessible 
{
	public void accessibleObject() 
	{
		AccessibleObject accessible = null;
		Object object = null;
		
		accessible.canAccess(object);
		accessible.trySetAccessible();
	}
}
