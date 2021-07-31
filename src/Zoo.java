

import Animals.*;
import Food.*;
import Interface.Swim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Zoo implements Swim {

    public static void main(String[] args) {
        // ������� � ����������
        List<Swim> swimArr = new ArrayList<>();
        Meat meat = new Meat();
        Grass grass = new Grass();
        Worker worker = new Worker();
        Horse horse = new Horse(20,50,"������");
        Bear bear = new Bear(10,60,"����");
        Cow cow = new Cow(5,40,"���");
        Dog dog = new Dog(100,30,"�������");
        Duck duck = new Duck(10,20,"�������");
        Fish fish = new Fish(10,20,"�������");

        //��������� ������� (�������, ����������)
        Aviary<Carnivorous> aviaryCarnivorous = new Aviary<Carnivorous>();
        Aviary<Herbivore> aviaryHerbivore = new Aviary<Herbivore>();

        //������ Swim
        swimArr.add(duck);
        swimArr.add(fish);

        //���������� �������
        aviaryCarnivorous.addAnimal(dog);
        aviaryCarnivorous.addAnimal(bear);
        aviaryCarnivorous.addAnimal(fish);
        aviaryHerbivore.addAnimal(duck);
        aviaryHerbivore.addAnimal(cow);
        aviaryHerbivore.addAnimal(horse);

        //��������� ������ (������������ �� ������)
        aviaryCarnivorous.getLinkAnimal(dog.getNameAnimal());
        System.out.println(System.lineSeparator());
        aviaryCarnivorous.getLinkAnimal(fish.getNameAnimal());
        System.out.println(System.lineSeparator());
        aviaryCarnivorous.getLinkAnimal(bear.getNameAnimal());
        System.out.println(System.lineSeparator());
        aviaryHerbivore.getLinkAnimal(duck.getNameAnimal());


        //getVoice
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
        System.out.println("����: ");
        worker.feed(fish, meat);
        System.out.println("����: ");
        worker.feed(fish, grass);
        System.out.println("�������: ");
        worker.feed(bear, grass);
        System.out.println("�������: ");
        worker.feed(bear, meat);
        for (Swim swim : swimArr) {
            swim.swim();

        }

    }


}

	
	




