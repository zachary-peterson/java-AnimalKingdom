package animals;

public abstract class AbstractAnimals {
	/*
	All animals consume food the same way
	Each animal is assigned a unique number, a name, and year discovered regardless of classification.
	*/
	private static int maxId = 0;
	protected int id;
	protected int year;
	protected String name; 

	public AbstractAnimals(String name, int year) {
		maxId++;
		id = maxId;

		this.name = name;
		this.year = year;
	}

	public abstract String move();
	public abstract String reproduce();
	public abstract String breath();

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	/*
	[Animals{id=6, name='Bigfoot', yearNamed=2021}
	, Animals{id=0, name='Panda', yearNamed=1869}
	, Animals{id=7, name='Pigeon', yearNamed=1837}
	, Animals{id=10, name='Parrot', yearNamed=1824}
	, Animals{id=8, name='Peacock', yearNamed=1821}
	, Animals{id=13, name='Catfish', yearNamed=1817}
	, Animals{id=2, name='Koala', yearNamed=1816}
	, Animals{id=3, name='Sloth', yearNamed=1804}
	, Animals{id=1, name='Zebra', yearNamed=1778}
	, Animals{id=4, name='Armadillo', yearNamed=1758}
	, Animals{id=5, name='Raccoon', yearNamed=1758}
	, Animals{id=9, name='Toucan', yearNamed=1758}
	, Animals{id=11, name='Swan', yearNamed=1758}
	, Animals{id=12, name='Salmon', yearNamed=1758}
	, Animals{id=14, name='Perch', yearNamed=1758}
	]
	*/

	@Override
	public String toString() {
        return "Animals { ID: " + id + ", Name: " + name + ", Year Named: " + year + " } " + "\n";
    }

}