import Animals.*;

import java.util.HashMap;
import java.util.Map;


public class Aviary<T extends Animals> {


    public HashMap<T, String> aviary = new HashMap<>();
    public void getAllSize() {
        for (AviarySize aviarySize : AviarySize.values()){
            System.out.println(aviarySize+ " = " + aviarySize.getParSize()+"�");
        }
    }
    public void addAnimal(T t) {


        if(aviary.isEmpty()){
            aviary.put(t, t.getNameAnimal());
            System.out.println(System.lineSeparator());
            System.out.println("---------- ���������� �������� � ������: "+t.getSize()+"----------------");
            System.out.println(t.getNameAnimal()+" ��������� � ������ ��������: " +t.getSize());
       }
      else if(aviary.keySet().iterator().next().getSize().equals(t.getSize()))
        {

           aviary.put(t, t.getNameAnimal());
            System.out.println(t.getNameAnimal()+ " ��������� � ������");
       } else {
           System.out.println(t.getNameAnimal() + " �� ��������. ������ �������: "+ aviary.keySet().iterator().next().getSize()+", ��� ����� ������: "+t.getSize());
        }
    }

    public void removeAnimal(T t, String name) {
    aviary.remove(t, name);
        }

    public void getLinkAnimal(String name) {
        if (aviary.containsValue(name)) {
            for (Map.Entry entry : aviary.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println(entry.getKey().getClass() + " ����������� �� ������: " + name + System.lineSeparator());
                }
            }
        } else {
            System.out.println("������..... " + name + " ���, ������..." + System.lineSeparator());
        }
    }

}



