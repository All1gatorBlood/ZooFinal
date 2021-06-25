package Animals;

public class Horse extends Herbivore {
	String horseName = "Лошадь";


	@Override
	public String voice() {
		String voiceHorse = "- Лошадь смотрит на тебя и никак не реагирует";
		System.out.println(horseName+" "+voiceHorse);
		return voiceHorse;
		
	}
	

}
