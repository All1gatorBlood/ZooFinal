package Animals;

import Interface.Swim;



public class Duck extends Herbivore implements Swim {
	public Duck(int hunger, int weight, String nameAnimal) {
		super(hunger, weight, nameAnimal);
	}

	@Override
	public AviarySize getSize() {
		return AviarySize.AVIARY_SIZE_10;
	}

	@Override
	public String voice() {
		String voiceDuck = "- ���� ������� �� ���� ��� �� ������ � �������";
		System.out.println(getClass()+" "+getNameAnimal()+" "+voiceDuck);
		return voiceDuck;
	}

	@Override
	public String getClassName() {
		return "���� ";
	}

	@Override
	public void swim() {
		System.out.println(getClass()+" "+getNameAnimal()+" "+" � ������");

	}
}