package Animals;

public class Cow extends Herbivore {
	String cowName = "������";

	@Override
	public String voice() {
		String voiceCow = "- �� ���������";
		System.out.println(cowName+" "+voiceCow);
		return voiceCow;
	}

}
