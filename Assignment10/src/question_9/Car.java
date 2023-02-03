package question_9;

public class Car extends GroundVehicles{
	private String noplates="NFS";
	public void drive() {
		String fly=drive("car","noplates");
		System.out.println("Flying airplane "+fly+noplates);
	}
	public void ponderEthicalDelemma() {
		System.out.println("ponderEthicalDelemma :"+noplates);
	}
}
