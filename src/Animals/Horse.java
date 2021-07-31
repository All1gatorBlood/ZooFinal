package Animals;


import Interface.Run;

public class Horse extends Herbivore implements Run {
	public Horse(int hunger, int weight, String nameAnimal) {
		super(hunger, weight, nameAnimal);
	}

	@Override
	public AviarySize getSize() {
		return AviarySize.AVIARY_SIZE_30;
	}

	@Override
	public String getClassName() {
		return "Лошадь ";
	}

	@Override
	public String voice() {
		String voiceHorse = "- Лошадь смотрит на тебя и никак не реагирует";
		System.out.println(getClass()+" "+getNameAnimal()+" "+voiceHorse);
		return voiceHorse;
		
	}


	@Override
	public void run() {
		System.out.println(getClassName()+getNameAnimal()+" мчу голопом");
		setHunger(getHunger()-10);
		System.out.println(getHunger());
	}

}
