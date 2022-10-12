package week1day2;

public class mobile {
	public void sendimage() {
		System.out.println("Send image");
	}
	public void sharefile() {
	System.out.println("Share file");
	
	}
	public void call() {
	System.out.println("Call");
	}
	public static void main(String[] args) {
	mobile actions = new mobile();
	actions.sendimage();
	actions.sharefile();
	actions.call();
	}

    }