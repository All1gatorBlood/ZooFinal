package Animals;

import Interface.Swim;

public class Duck extends Herbivore implements Swim {
	String duckName = "Утка";

	@Override
	public String voice() {
		String voiceDuck = "- Утка смотрит на тебя как на дурака и крякает";
		System.out.println(duckName+" "+voiceDuck);
		return voiceDuck;
	}

	@Override
	public void swim() {
		System.out.println("Я утка я плаваю");
		
	}

}
