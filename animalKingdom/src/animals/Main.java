package animals;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static List<AbstractAnimals> filterAnimals(List<AbstractAnimals> animalList, Check tester) {		
		List<AbstractAnimals> tempList = new ArrayList<>();

		for(AbstractAnimals v: animalList) {
			if(tester.test(v)) {
				tempList.add(v);
			}
		}
		return tempList;
	}

	public static void main(String[] args) {
		System.out.println("Animal Kingdom is up and running");

		/*
		    | Name      | Year Named |
		    |-----------|-------|
		    | Panda     | 1869  |
		    | Zebra     | 1778  |
		    | Koala     | 1816  |
		    | Sloth     | 1804  |
		    | Armadillo | 1758  |
		    | Raccoon   | 1758  |
		    | Bigfoot   | 2021  |

		* [ ] **Birds:**

		    | Name      | Year Named |
		    |-----------|------|
		    | Pigeon    | 1837 |
		    | Peacock   | 1821 |
		    | Toucan    | 1758 |
		    | Parrot    | 1824 |
		    | Swan      | 1758 |

		* [ ] **Fish:**

		    | Name      | Year Named |
		    |-----------|------|
		    | Salmon    | 1758 |
		    | Catfish   | 1817 |
		    | Perch     | 1758 |
		*/

								// String name, int year
		Mammals panda = new Mammals("Panda", 1869);
		Mammals zebra = new Mammals("Zebra", 1778);
		Mammals koala = new Mammals("Koala", 1816);
		Mammals sloth = new Mammals("Sloth", 1804);
		Mammals armadillo = new Mammals("Armadillo", 1758);
		Mammals raccoon = new Mammals("Raccoon", 1758);
		Mammals bigfoot = new Mammals("Bigfoot", 2020); // <---- 2020 vibes

		Birds pigeon = new Birds("Pigeon", 1837);
		Birds peacock = new Birds("Peacock", 1821);
		Birds toucan = new Birds("Toucan", 1758);
		Birds parrot = new Birds("Parrot", 1824);
		Birds swan = new Birds("Swan", 1758);

		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);


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
		
		List<AbstractAnimals> animalList = new ArrayList<>();
		animalList.add(panda);
		animalList.add(zebra);
		animalList.add(koala);
		animalList.add(sloth);
		animalList.add(armadillo);
		animalList.add(raccoon);
		animalList.add(bigfoot);
		animalList.add(pigeon);
		animalList.add(peacock);
		animalList.add(toucan);
		animalList.add(parrot);
		animalList.add(swan);
		animalList.add(salmon);
		animalList.add(catfish);
		animalList.add(perch);

		// System.out.println(animalList); 

		// *** List all the animals in descending order by year named ***
		animalList.sort((v1, v2) -> v2.year - v1.year);
		System.out.println(animalList);
		System.out.println(); 

		// *** List all the animals alphabetically ***
		animalList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
		System.out.println(animalList);
		System.out.println(); 

		// *** List all the animals order by how they move ***
		animalList.sort((v1, v2) -> v1.move().compareTo(v2.move()));
		System.out.println(animalList);
		System.out.println(); 

		// *** List only those animals the breath with lungs ***
		List<AbstractAnimals> animalsWithLungs = filterAnimals(animalList, v -> v.breath() == "Lungs");
		System.out.println(animalsWithLungs);
		System.out.println(); 

		// *** List only those animals that breath with lungs and were named in 1758 ***
		List<AbstractAnimals> oldAnimalsWithLungs = filterAnimals(animalsWithLungs, v -> v.getYear() == 1758);
		System.out.println(oldAnimalsWithLungs);
		System.out.println(); 

		// *** List only those animals that lay eggs and breath with lungs ***
		List<AbstractAnimals> animalsEggs = filterAnimals(animalList, v -> v.reproduce() == "Eggs");
		List<AbstractAnimals> animalsWithLungsEggs = filterAnimals(animalsEggs, v -> v.breath() == "Lungs");
		System.out.println(animalsWithLungsEggs);
		System.out.println(); 

		// *** List alphabetically only those animals that were named in 1758 ***
		List<AbstractAnimals> animalsOld = filterAnimals(animalList, v -> v.getYear() == 1758);
		animalsOld.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
		System.out.println(animalsOld);
		System.out.println(); 
	}
}