package animals;

public class Fish extends AbstractAnimals {
	private String name;

	public Fish(String name, int year) {
		super(name, year);
	}

	@Override
	public String move() {
		return "Swim";
	}

	@Override
	public String reproduce() {
		return "Eggs";
	}

	@Override
	public String breath() {
		return "Gills";
	}
}