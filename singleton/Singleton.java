package singleton;

import java.io.ObjectStreamException;

public class Singleton {
	//The class has only one object that has a global access
	
	//volatile - helps to not allow half baked object (against multi-threading bugs) - whatever that means
	private static volatile Singleton soleInstance = null;
	
	private Singleton() {
		//countering reflection by not allowing reflection to access the constructor to create a new instance
		if (soleInstance != null) {
			throw new RuntimeException("You cannot create a new instance of the class. Please use the getSingleton() method.");
		}
		System.out.println("Singleton created.");
	}
	
	//Lazy initialization
	public static Singleton getSingleton() {
		if (soleInstance == null) {
			//when we have synchronized the getSingleton, multiple threads cannot create an object at the same time when soleInstance is null
			//Double checked locking vs multi-threaded access
			synchronized(Singleton.class) {
				if (soleInstance == null) {
					soleInstance = new Singleton();									
				}
			}
		}
		return soleInstance;
	}
	
	//countering serialization/deserialization - before deserialization happens, java runs readResolve method, and here we set the output the same soleinstance
	private Object readResolve() throws ObjectStreamException {
		return soleInstance;
	}

}
