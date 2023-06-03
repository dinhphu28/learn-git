public class Honda extends Bike {
	int speedLimit = 150;

	public static void main(String[] args) {
		Bike bike = new Honda();
		Honda bike2 = new Honda();

		System.out.println("SpeedLimit by upcasting: " + bike.speedLimit);
		System.out.println("SpeedLimit by create directly with class: " + bike2.speedLimit);
	}
}
