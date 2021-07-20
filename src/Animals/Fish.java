package Animals;

import Interface.Swim;

import java.util.Objects;

public class Fish extends Carnivorous implements Swim {
	public Fish(int hunger, int weight, String nameAnimal) {
		super(hunger, weight, nameAnimal);
	}

	@Override
	public String voice() {
		String voiceFish = "- �������, �� �����? ���� �� �������������";
		System.out.println(voiceFish);
		return voiceFish;
		
	}

	@Override
	public void swim() {
		System.out.println("� ���� � ������");
		
	}

}
