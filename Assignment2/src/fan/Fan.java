package fan;

public class Fan {
	private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";
	private Object TRUE;
 
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    Fan() {
    }

    /**
     * 
     * @return int
     */
	public int getSpeed() {
		return speed;
	}

	/**
	 * 
	 * @param speed
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * 
	 * @return boolean
	 */
	public boolean isOn() {
		return on;
	}

	/**
	 * 
	 * @param on
	 */
	public void setOn(boolean on) {
		this.on = on;
	}

	/**
	 * 
	 * @return double
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * 
	 * @param radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * 
	 * @return String
	 */
	public String getColor() {
		return color;
	}

	/**
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * This method provide description of the fan
	 */
	public String toString() {
		if (isOn() == true) {
			return "Speed: " + getSpeed() + " Color: " + getColor() + " Radius: " + getRadius();
		} else {
			return "Color: " + getColor() + " Radius: " + getRadius() + "Fan is off";
		}
	}
}
