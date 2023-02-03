package question_9;

public class Truck extends GroundVehicles{
	private double capacity=100.0;
	public void drive() {
		String fly=drive("car","noplates");
		System.out.println("Flying airplane "+fly+capacity);
	}
	public void loadCargo() {
		System.out.println("load cargo  :"+capacity);
	}
}
