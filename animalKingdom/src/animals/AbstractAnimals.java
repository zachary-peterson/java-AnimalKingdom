package animals;

abstract class AbstractAnimal {
	/*
	All animals consume food the same way
	Each animal is assigned a unique number, a name, and year discovered regardless of classification.
	*/
	protected static int maxId = 0;
	protected int id;
	protected int year;
	protected int food;

	public AbstractAnimal() {
		year = 1;
		food = 1;
	}

	public AbstractAnimal(int year, int food) {
		maxId++;
		id = maxId;
		
		this.year = year;
		this.food = food;
	}

	abstract String getPath();
	abstract String getName();

	void move() {
		food--;
	}

	void move(int movement) {
		food = food - movement;
	}

	int getFoodLevel() {
		return food;
	}

	void addFood(int i) {
		food = food + i;
	}
}