package Animals;


import Food.*;

public abstract class Herbivore extends Animals {
	public Herbivore(int hunger, int weight, String nameAnimal) {
		super(hunger, weight, nameAnimal);
	}

	@Override
	public void eat(Food food) {
	if (food instanceof Grass) {
		System.out.println("������� ����");
		
	}else {
		System.out.println("� ����� �� ��");
	}
	
}
}
