package Animals;


import Food.*;

public abstract class Carnivorous extends Animals {

@Override
	public void eat(Food food) {
	if (food instanceof Meat) {
		System.out.println("������� ����");
		
	}else {
		System.out.println("� ����� �� ��");
	}
	
}


}
