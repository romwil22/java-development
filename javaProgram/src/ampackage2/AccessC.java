package ampackage2;
import ampackage1.*;

public class AccessC {
	String message = "No modifier message"; // can access only same package and class
	public String publicMessage = "Public message"; // can access all packages and classes
	protected String protectedMessage = "Protected message"; // can access classes, packages, and subclasses
	private String privateMessage = "Private message"; // can access only within the class
}
