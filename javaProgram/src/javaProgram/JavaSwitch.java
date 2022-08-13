package javaProgram;

public class JavaSwitch {

	public static void main(String[] args) {
		String menu;
		
		menu = "chicken meal";
		
		switch (menu) {
		case "coco milktea":
			System.out.println("You order coco miltea");
			break;
		case "pearl milktea":
			System.out.println("You order pearl miltea");
			break;
		case "taro milktea":
			System.out.println("You order taro miltea");
			break;
		case "panda milktea":
			System.out.println("You order panda miltea");
			break;
		default:
			System.out.println("Sorry we dont have " + menu);
			break;
		}

	}

}
