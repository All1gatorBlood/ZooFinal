package Animals;


import Food.*;

public abstract class Herbivore extends Animals {
	@Override
	public void eat(Food food) {
	if (food instanceof Grass) {
		System.out.println("������� ����");
		
	}else {
		System.out.println("� ����� �� ��");
	}
	
}
}
