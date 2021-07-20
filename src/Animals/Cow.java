package Animals;

import java.util.Objects;

public class Cow extends Herbivore {
	public Cow(int hunger, int weight, String nameAnimal) {
		super(hunger, weight, nameAnimal);
	}

	@Override
	public String voice() {
		String voiceCow = "- Не реагирует";
		System.out.println(voiceCow);
		return voiceCow;
	}

}
