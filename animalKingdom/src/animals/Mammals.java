package animals;

public class Mammals extends AbstractAnimals {
	private String name;

	public Mammals(String name, int year) {
		super(name, year);
	}

	@Override
	public String move() {
		return "Walk";
	}

	@Override
	public String reproduce() {
		return "Live Births";
	}

	@Override
	public String breath() {
		return "Lungs";
	}

	// Zebra live births walk lungs 1778

	// @Override
	// public String toString() {
	// 	return name + giveBirth() + getPath() + year;
	// }
}