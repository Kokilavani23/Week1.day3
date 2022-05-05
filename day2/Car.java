package Week1.day2;

public class Car  {
	
	public void applyBreak() {
		System.out.println("press break");
	}
	public void applyGear() {
		System.out.println("put Gear2");
	}
	public void switchonAc() {
		System.out.println("press Ac button");
	}
	public void applyAcclerate() {
		System.out.println("put acclerate");
	}

	public static void main(String[] args) {
		Car c= new Car();
		c.applyBreak();
		c.applyGear();
		c.switchonAc();
		c.applyAcclerate();

	}

}
