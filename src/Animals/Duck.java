package Animals;

import Interface.Swim;

public class Duck extends Herbivore implements Swim {
	String duckName = "����";

	@Override
	public String voice() {
		String voiceDuck = "- ���� ������� �� ���� ��� �� ������ � �������";
		System.out.println(duckName+" "+voiceDuck);
		return voiceDuck;
	}

	@Override
	public void swim() {
		System.out.println("� ���� � ������");
		
	}

}
