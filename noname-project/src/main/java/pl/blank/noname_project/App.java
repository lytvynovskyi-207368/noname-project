package pl.blank.noname_project;

/**
 * Hello world!
 *
 */

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println(sayMyName());
	}

	@SuppressWarnings("unused")
	private String mateuszFunction(String value) {
		return "Hello: " + value;
	}

	public void litwinowskiFunction() {
		System.out.println("Hello Anton!");
		
	}

	public static String sayMyName() {
		return "Bartłomiej";
	}
}
