package Animals;

public class Dog extends Carnivorous {
	String dogName = "������";

	@Override
	public String voice() {
		String voiceDog = "- ���-���-���";
		System.out.println(dogName+" "+voiceDog);
		return voiceDog;
	}

}
