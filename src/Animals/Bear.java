package Animals;


public class Bear extends Carnivorous {
	public Bear(int hunger, int weight, String nameAnimal) {
		super(hunger, weight, nameAnimal);
	}

	@Override
	public AviarySize getSize() {
		return AviarySize.AVIARY_SIZE_40;
	}

	@Override
	public String getClassName() {
		return "Медведь ";
	}

	@Override
	public String voice() {
		String voiceBear = "- Он скорее откусит тебе лицо, чем будет слушать твои команды";
		System.out.println(getClass()+" "+getNameAnimal()+" "+voiceBear);
		return voiceBear;
	}


}
