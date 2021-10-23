package co.edu.poli.mixpattern2.model;

/**
 * 
 */
public class Temperature extends Sensor {

	private double voltI;
	private double voltO;

	public Temperature (double voltI, double voltO) {
		super();
		this.voltI = voltI;
		this.voltO = voltO;
	}

	@Override
	public double calcConversion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateWasteEnergy() {
		return voltI/voltO + 0.00018;
	}

	@Override
	public void addComponent(Component cp) {
	}
	
	@Override
	public String toString() {
		return "Temperature [voltI=" + voltI + ", voltO=" + voltO + "] "+ printState();
	}

}