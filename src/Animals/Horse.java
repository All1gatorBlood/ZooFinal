package Animals;

import java.util.Objects;

public class Horse extends Herbivore {
	public Horse(int hunger, int weight, String nameAnimal) {
		super(hunger, weight, nameAnimal);
	}

	@Override
	public String voice() {
		String voiceHorse = "- Лошадь смотрит на тебя и никак не реагирует";
		System.out.println(voiceHorse);
		return voiceHorse;
		
	}

}
