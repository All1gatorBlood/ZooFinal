import Animals.Animals;

import java.util.HashMap;
import java.util.Map;

public class Aviary<T extends Animals> {
    public HashMap<T, String> aviary = new HashMap<>();

    public void addAnimal(T t) {
        aviary.put(t,t.getNameAnimal());
    }

    public void removeAnimal(T t, String name) {
        aviary.remove(t, name);
    }

    public void getLinkAnimal(String name) {
        if (aviary.containsValue(name)) {
            for (HashMap.Entry entry : aviary.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println(entry.getKey() + " ����������� �� ������: " + name + System.lineSeparator());
                }
            }
        } else {
            System.out.println("����� ����� �������, �� " + name + " ��� ���." + System.lineSeparator());
        }
    }
}



