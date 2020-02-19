package fan;

public class FanTest {
	public static void main(String[] args) {

		// Create first fan object
		Fan fanOne = new Fan();
		fanOne.setSpeed(3);
		fanOne.setRadius(10);
		fanOne.setColor("Yellow");
		fanOne.setOn(true);
		// Display the fan properties
		System.out.println("\nFirst fan properties are: " + fanOne.toString());

		// Create the second fan object
		Fan fanTwo = new Fan();
		fanTwo.setSpeed(2);
		fanTwo.setRadius(5);
		fanTwo.setColor("Blue");
		fanTwo.setOn(false);
		// Display the fan properties
		System.out.println("\nSecond fan properties are: " + fanTwo.toString());
	}
}
