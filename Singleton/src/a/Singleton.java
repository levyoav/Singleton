package a;

//Singleton Class
/*
 * Here the class creates an instance when it doesn't exist and returns the same
 * instance other times.
 */
public class Singleton {
	private static Singleton uniqueInstance;
	
	private Singleton() {};
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
			System.out.println("Singleton class is instantiated now.");
			return uniqueInstance;
		} else {
			System.out.println("Singleton class has already been instantiated.");
			return uniqueInstance;
		}
	}
}
