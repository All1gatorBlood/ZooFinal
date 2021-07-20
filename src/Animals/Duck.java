package Animals;

import Interface.Swim;

import java.util.Objects;

public class Duck extends Herbivore implements Swim {
	public Duck(int hunger, int weight, String nameAnimal) {
		super(hunger, weight, nameAnimal);
	}

	@Override
	public String voice() {
		String voiceDuck = "- ���� ������� �� ���� ��� �� ������ � �������";
		System.out.println(voiceDuck);
		return voiceDuck;
	}

	@Override
	public void swim() {
		System.out.println("� ���� � ������");

	}
}