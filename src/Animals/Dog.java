package Animals;



public class Dog extends Carnivorous {
	public Dog(int hunger, int weight, String nameAnimal) {
		super(hunger, weight, nameAnimal);
	}

	@Override
	public AviarySize getSize() {
		return AviarySize.AVIARY_SIZE_20;
	}

	@Override
	public String getClassName() {
		return "������ ";
	}

	@Override
	public String voice() {
		String voiceDog = "- ���-���-���";
		System.out.println(getClass()+" "+getNameAnimal()+" "+voiceDog);
		return voiceDog;
	}

}
