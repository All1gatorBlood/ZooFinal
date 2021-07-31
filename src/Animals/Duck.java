package Animals;

import Interface.Swim;



public class Duck extends Herbivore implements Swim {
	public Duck(int hunger, int weight, String nameAnimal) {
		super(hunger, weight, nameAnimal);
	}

	@Override
	public AviarySize getSize() {
		return AviarySize.AVIARY_SIZE_10;
	}

	@Override
	public String voice() {
		String voiceDuck = "- Утка смотрит на тебя как на дурака и крякает";
		System.out.println(getClass()+" "+getNameAnimal()+" "+voiceDuck);
		return voiceDuck;
	}

	@Override
	public String getClassName() {
		return "Утка ";
	}

	@Override
	public void swim() {
		System.out.println(getClass()+" "+getNameAnimal()+" "+" я плаваю");

	}
}