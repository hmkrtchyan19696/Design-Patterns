package singleton;

import java.lang.reflect.Constructor;

class SingletonDemo {
	
	public static void main(String[] args) throws Exception {
		
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		
		print("s1",s1);
		print("s2",s2);
		
		//Trying to break the single object principle
		
		// 1. Reflection - allows the executing java program to examine or 'introspect' upon itself and manipulate internal properties of the program.
		Class<?> newClass = Class.forName("Design_Patterns.Singleton");
		@SuppressWarnings("unchecked")
		Constructor<Singleton> newConstructor = (Constructor<Singleton>) newClass.getDeclaredConstructor();
		newConstructor.setAccessible(true);
		
		Singleton s3 = newConstructor.newInstance();
		
		print("s3",s3);
		
		// 2. Serialization/Deserialization - using bite streams to create a copy of the new object (the Singleton class has to implement Serializable Interface)
		// 3. Clone (Singleton has to implement Clonable interface)
		// 4. Multi-thread - sometimes will create two separate object sometimes the same object
		
		
	}
	
	private static void print(String name, Singleton object) {
		System.out.println(String.format("Object: %s -  HashCode: %d", name, object.hashCode()));
	}

}
