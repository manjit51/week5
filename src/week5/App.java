package week5;

// interface setup
interface Logger {
	public void log(String s);
	public void error(String s);
}

// create asterisk logger
class AsteriskLogger implements Logger {
	
	// just print the string surrounded by asterisks
	public void log(String s) {
		System.out.println("***" + s + "***");
	}
	
	// intelligently changes box size to match size of string
	public void error(String s) {
		
		//get length
		int l = s.length();
		
		// print the top of the box
		System.out.print("**********");
		for(int i = 0; i < l; i++) {
			System.out.print("*");
		}
		System.out.println("***");
		
		//print the middle
		System.out.println("***ERROR: " + s + "***");
		
		// print the bottom of the box
		System.out.print("**********");
		for(int i = 0; i < l; i++) {
			System.out.print("*");
		}
		System.out.println("***");
	}
}

// create spaced logger
class SpacedLogger implements Logger {
	
	// loops through the string adding spaces as it goes
	public void log(String s) {
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");
		}
		System.out.println();
	}
	
	// same as above but adds the word "ERROR: " in front
	public void error(String s) {
		System.out.print("ERROR: ");
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");
		}
		System.out.println();
	}
}

// main class
public class App {
	
	// main method
	public static void main(String[] args) {
		AsteriskLogger aLogs = new AsteriskLogger();
		SpacedLogger sLogs = new SpacedLogger();
		
		// call the objects i declared to test their function
		aLogs.log("test");
		aLogs.error("Funnies");
		sLogs.log("big meme");
		sLogs.error("in space");
	}
	// test comment
}
