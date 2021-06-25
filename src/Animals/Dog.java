package Animals;

public class Dog extends Carnivorous {
	String dogName = "Собака";

	@Override
	public String voice() {
		String voiceDog = "- Гав-Гав-Гав";
		System.out.println(dogName+" "+voiceDog);
		return voiceDog;
	}

}
