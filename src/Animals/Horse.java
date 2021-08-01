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
		return "Ћошадь ";
	}

	@Override
	public String voice() {
		String voiceHorse = "- Ћошадь смотрит на теб€ и никак не реагирует";
		System.out.println(getClass()+" "+getNameAnimal()+" "+voiceHorse);
		return voiceHorse;
		
	}


	@Override
	public void run() {
		System.out.println(getClassName()+getNameAnimal()+" бежит");
		setHunger(getHunger()-10);
		System.out.println("—ытость уменьшилась на 10"+System.lineSeparator() + "—ытость: "+getHunger());
	}

}
