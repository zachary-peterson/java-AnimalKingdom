package animals;

public class Birds extends AbstractAnimals {
	private String name;

	public Birds(String name, int year) {
		super(name, year);
	}

	@Override
	public String move() {
		return "Fly";
	}

	@Override
	public String reproduce() {
		return "Eggs";
	}

	@Override
	public String breath() {
		return "Lungs";
	}

}