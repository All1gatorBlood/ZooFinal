package Animals;


import Food.*;

public abstract class Carnivorous extends Animals {


	public Carnivorous(int hunger, int weight, String nameAnimal) {
		super(hunger, weight, nameAnimal);
	}

	@Override
	public void eat(Food food) {
	if (food instanceof Meat) {
		System.out.println(getClassName()+getNameAnimal()+" ������� ����");
		setHunger(getHunger()+food.getHang());
	}else {
		System.out.println(getClassName()+getNameAnimal()+"� ����� �� ��");
	}

	
}


}
