package Animals;

import Interface.Swim;


public class Fish extends Carnivorous implements Swim {
	public Fish(int hunger, int weight, String nameAnimal) {
		super(hunger, weight, nameAnimal);
	}

	@Override
	public AviarySize getSize() {
		return AviarySize.AVIARY_SIZE_10;
	}

	@Override
	public String voice() {
		String voiceFish = "- Дружище, ты идиот? рыбы не разговаривают";
		System.out.println(getClass()+" "+getNameAnimal()+" "+voiceFish);
		return voiceFish;
		
	}

	@Override
	public String getClassName() {
		return "Рыба ";
	}

	@Override
	public void swim() {
		System.out.println(getClass()+" "+getNameAnimal()+" "+ "я плаваю");
		
	}


}
