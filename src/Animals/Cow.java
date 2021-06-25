package Animals;

public class Cow extends Herbivore {
	String cowName = "Корова";

	@Override
	public String voice() {
		String voiceCow = "- Не реагирует";
		System.out.println(cowName+" "+voiceCow);
		return voiceCow;
	}

}
