package week1day2;

public class Car {
	public void applyhandbrake() {
		System.out.println("Applyhandbrake");
	}
public void applyclutch() {
	System.out.println("Apply clutch");
}
public void switchOnSong() {
	System.out.println("Switch on song");
}
public void applyAccelerate() {
	System.out.println("Apply Accelerate");
}
public static void main(String[] args) {
	Car actions = new Car();
	actions.applyhandbrake();
	actions.applyclutch();
	actions.switchOnSong();
	actions.applyAccelerate();
}
}
