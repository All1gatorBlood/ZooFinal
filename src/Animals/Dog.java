package Animals;

import java.util.Objects;

public class Dog extends Carnivorous {
	public Dog(int hunger, int weight, String nameAnimal) {
		super(hunger, weight, nameAnimal);
	}

	@Override
	public String voice() {
		String voiceDog = "- √‡‚-√‡‚-√‡‚";
		System.out.println(voiceDog);
		return voiceDog;
	}

}
