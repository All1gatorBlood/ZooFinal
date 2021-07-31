

import Animals.*;
import Food.*;
import Interface.Swim;

import java.util.*;


public abstract class Zoo implements Swim {

    public static void main(String[] args) {
        // ������� � ����������
        List<Swim> swimArr = new ArrayList<>();
        Meat steak= new Meat(5,"�����");
        Grass weed = new Grass(5,"������");
        Worker worker = new Worker();
        Horse horse = new Horse(20,50,"������");
        Bear bear = new Bear(10,10,"����");
        Cow cow = new Cow(5,40,"���");
        Dog dog = new Dog(100,10,"�������");
        Duck duck = new Duck(10,20,"�������");
        Fish fish = new Fish(10,20,"�������");

        //��������� ������� (�������, ����������)
        Aviary<Carnivorous> aviaryCarnivorous = new Aviary<Carnivorous>();
        Aviary<Herbivore> aviaryHerbivore = new Aviary<Herbivore>();


        //������ Swim
        swimArr.add(duck);
        swimArr.add(fish);

        //������� ��������
        System.out.println(System.lineSeparator());
        System.out.println("������� �������� ��� ����������: ");
        aviaryCarnivorous.getAllSize();
        System.out.println("----------------------------------");
        System.out.println("������� �������� ��� ����������: ");
        aviaryHerbivore.getAllSize();

        //���������� �������
        aviaryCarnivorous.addAnimal(bear);
        aviaryCarnivorous.addAnimal(dog);
        aviaryCarnivorous.addAnimal(fish);
        aviaryHerbivore.addAnimal(duck);




        //getVoice
        System.out.println(System.lineSeparator());
        System.out.println("---------������� ��������� ��������-----------");
        worker.getVoice(dog);
        worker.getVoice(horse);
        worker.getVoice(bear);
        worker.getVoice(cow);
        worker.getVoice(fish);
        worker.getVoice(duck);
        System.out.println(System.lineSeparator());
        System.out.println("---------------------");
        System.out.println(System.lineSeparator());

        //feed

       // worker.feed(fish, meat);
     //   worker.feed(fish, grass);
     //   worker.feed(bear, grass);
     //   worker.feed(bear, meat);
        for (Swim swim : swimArr) {
            swim.swim();

        }
        //�������� �� �������
        aviaryCarnivorous.removeAnimal(bear, bear.getNameAnimal());

        //��������� ������ (������������ �� ������)
        aviaryCarnivorous.getLinkAnimal(dog.getNameAnimal());
        System.out.println("---------------------------");
        aviaryCarnivorous.getLinkAnimal(fish.getNameAnimal());
        System.out.println("---------------------------");
        aviaryCarnivorous.getLinkAnimal(bear.getNameAnimal());
        System.out.println("---------------------------");
        aviaryHerbivore.getLinkAnimal(duck.getNameAnimal());
        horse.run();



    }


}

	
	




