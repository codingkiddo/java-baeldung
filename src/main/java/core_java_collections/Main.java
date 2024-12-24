package core_java_collections;

import junit.runner.Version;

public class Main {
	public static void main(String[] args) {
		
		System.out.println(Version.id());
		
		try {
//			getClass("core_java_collections.com.baeldung.collections.combiningcollections.CombiningArrays", Main.class);
			getClass("junit.runner.Version", Main.class);
			System.out.println("Found");
		} catch (ClassNotFoundException e) {
			System.out.println("Not found");
			e.printStackTrace();
		}
	}

	public static Class<?> getClass(String className, Class<?> callingClass) throws ClassNotFoundException {
		return Class.forName(className);
	}
}