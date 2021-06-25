package Animals;

import Interface.Swim;

public class Fish extends Carnivorous implements Swim {
	String fishName = "Рыба";
	
	@Override
	public String voice() {
		String voiceFish = "- Дружище, ты идиот? рыбы не разговаривают";
		System.out.println(fishName+" "+voiceFish);
		return voiceFish;
		
	}

	@Override
	public void swim() {
		System.out.println("Я рыба я плаваю");
		
	}

}
