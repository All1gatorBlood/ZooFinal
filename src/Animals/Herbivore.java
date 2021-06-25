package Animals;


import Food.*;

public abstract class Herbivore extends Animals {
	@Override
	public void eat(Food food) {
	if (food instanceof Grass) {
		System.out.println("¬кусное м€со");
		
	}else {
		System.out.println("я такое не ем");
	}
	
}
}
