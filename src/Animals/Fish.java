package Animals;

import Interface.Swim;

public class Fish extends Carnivorous implements Swim {
	String fishName = "����";
	
	@Override
	public String voice() {
		String voiceFish = "- �������, �� �����? ���� �� �������������";
		System.out.println(fishName+" "+voiceFish);
		return voiceFish;
		
	}

	@Override
	public void swim() {
		System.out.println("� ���� � ������");
		
	}

}
