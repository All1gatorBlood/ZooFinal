package Animals;

public class Bear extends Carnivorous {
	String bearName = "�������";

	@Override
	public String voice() {
		String voiceBear = "- �� ������ ������� ���� ����, ��� ����� ������� ���� �������";
		System.out.println(bearName+" "+voiceBear);
		return voiceBear;
	}
	

}
