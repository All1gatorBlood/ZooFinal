package Animals;

public class Horse extends Herbivore {
	String horseName = "������";


	@Override
	public String voice() {
		String voiceHorse = "- ������ ������� �� ���� � ����� �� ���������";
		System.out.println(horseName+" "+voiceHorse);
		return voiceHorse;
		
	}
	

}
