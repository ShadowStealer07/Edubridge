package question_9;

public class Airoplane extends FlyingVehicles {
private int passangers=110;
public void Fly() {
	String fly=fly("airoplane","passangers");
	System.out.println("Flying airplane "+fly+passangers);
}
public void land() {
	String land=land("airoplane","passangers");
	System.out.println("Landing airplace "+land+passangers);
}
@Override
public String toString() {
	return "Airoplane [passangers=" + passangers + "]";
}
}
