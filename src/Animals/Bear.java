package Animals;

public class Bear extends Carnivorous {
	String bearName = "Медведь";

	@Override
	public String voice() {
		String voiceBear = "- Он скорее откусит тебе лицо, чем будет слушать твои команды";
		System.out.println(bearName+" "+voiceBear);
		return voiceBear;
	}
	

}
