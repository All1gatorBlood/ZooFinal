package Animals;


import Food.*;

public abstract class Carnivorous extends Animals {
	public Carnivorous(int hunger, int weight, String nameAnimal) {
		super(hunger, weight, nameAnimal);
	}

	@Override
	public void eat(Food food) {
	if (food instanceof Meat) {
		System.out.println("¬кусное м€со");
		
	}else {
		System.out.println("я такое не ем");
	}

	
}


}
