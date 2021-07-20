package Animals;


import Food.Food;
import Interface.Voice;

public abstract class Animals implements Voice {
	int hunger, weight;
	String nameAnimal;

	public Animals(int hunger, int weight, String nameAnimal) {
		this.hunger = hunger;
		this.weight = weight;
		this.nameAnimal = nameAnimal;
	}

	public int getHunger() {
		return hunger;
	}

	public int getWeight() {
		return weight;
	}

	public String getNameAnimal() {
		return nameAnimal;
	}

	public void eat(Food food) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
