package Animals;


import Food.Food;
import Interface.Voice;

public abstract class Animals implements Voice {
	private int hunger, weight;
	private String nameAnimal;

	public Animals(int hunger, int weight, String nameAnimal) {
		this.hunger = hunger;
		this.weight = weight;
		this.nameAnimal = nameAnimal;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}


	public String getNameAnimal() {
		return nameAnimal;
	}
	public abstract AviarySize getSize();
	public  void eat(Food food){

	}
	public abstract String getClassName();


	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

}
