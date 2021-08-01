package Animals;


import Food.*;

public abstract class Carnivorous extends Animals {


	public Carnivorous(int hunger, int weight, String nameAnimal) {
		super(hunger, weight, nameAnimal);
	}

	@Override
	public void eat(Food food) {

		if (food instanceof Grass) {
			System.out.println(getClassName() + getNameAnimal() + " ¬кусное м€со");
			setHunger(getHunger() + food.getHang());
		} else {
			try {
				throw new WrongFoodException();
			} catch (WrongFoodException e) {
				System.err.println(getClassName() + getNameAnimal() + " нюхает траву, € такое не ем");
			}

		}

	}
}
