package question_9;

public class Vehicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airoplane airplane=new Airoplane();
		SpaceShip spaceship=new SpaceShip();
		Car car=new Car();
		Truck truck=new Truck();
		
		//airplane
		airplane.Fly();
		airplane.land();
		
		//spaceship
		spaceship.Fly();
		spaceship.land();
		
		//car
		car.drive();
		car.ponderEthicalDelemma();
		
		//truck
		truck.drive();
		truck.loadCargo();
	}

}
