package Animals;


public class Cow extends Herbivore {
	public Cow(int hunger, int weight, String nameAnimal) {
		super(hunger, weight, nameAnimal);
	}

	@Override
	public AviarySize getSize() {
		return AviarySize.AVIARY_SIZE_30;
	}

	@Override
	public String getClassName() {
		return "������ ";
	}

	@Override
	public String voice() {
		String voiceCow = "- �� ���������";
		System.out.println(getClass()+" "+getNameAnimal()+" "+voiceCow);
		return voiceCow;
	}

}
