package animals;

public class Mammals extends AbstractAnimals {
	private String name;

	public Mammals(String name, int food) {
		super(food);
		this.name = name;
	}

	public Mammals(String name) {
		this.name = name;
	}

	@Override
	public String getPath() {
		return "Walk";
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return ""
	}
}