package question_9;

public class SpaceShip extends FlyingVehicles {
private boolean hyperdrive=true;
public void Fly() {
	String fly=fly("spaceship","hyperdrive");
	System.out.println("Flying airplane "+fly+hyperdrive);
}
public void land() {
	String land=land("spaceship","hyperdrive");
	System.out.println("Landing airplace "+land+hyperdrive);
}
@Override
public String toString() {
	return "SpaceShip [hyperdrive=" + hyperdrive + "]";
}
}
