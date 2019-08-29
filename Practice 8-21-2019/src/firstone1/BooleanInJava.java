package firstone1;

public class BooleanInJava {

	public static void main(String[] args) {

		boolean openWindow = true;
		boolean closeWindow = false;
		int windowCounter = 0;
		boolean passAllwindows = false;
		if (openWindow) {
			System.out.println(" The window on my Room is opened ");
			windowCounter = windowCounter + 1;
		}
		if (openWindow) {
			System.out.println("The window in My Living room is close ");
			windowCounter = windowCounter + 1;

		}
		if (openWindow) {
			System.out.println("the window Next My Room Is Close");
			windowCounter = windowCounter + 1;
		}
		if (windowCounter == 3) {
			passAllwindows = true;

		}
		if (passAllwindows) {
			System.out.println("yes ConGratilations");
		}

	}
}