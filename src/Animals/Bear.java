package Animals;

import java.util.Objects;

public class Bear extends Carnivorous {

	public Bear(int hunger, int weight, String nameAnimal) {
		super(hunger, weight, nameAnimal);
	}

	@Override
	public String voice() {
		String voiceBear = "- Он скорее откусит тебе лицо, чем будет слушать твои команды";
		System.out.println(voiceBear);
		return voiceBear;
	}

}
