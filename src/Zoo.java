

import Animals.*;
import Food.*;
import Interface.Swim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Zoo implements Swim {

    public static void main(String[] args) {
        // Объекты и переменные
        List<Swim> swimArr = new ArrayList<>();
        Meat meat = new Meat();
        Grass grass = new Grass();
        Worker worker = new Worker();
        Horse horse = new Horse(20,50,"Лошадь1");
        Bear bear = new Bear(10,60,"Медведь1");
        Cow cow = new Cow(5,40,"Корова1");
        Dog dog = new Dog(100,30,"Собака1");
        Duck duck = new Duck(10,20,"Утка1");
        Fish fish = new Fish(10,20,"Аркадий");
        Aviary<Carnivorous> aviaryCarnivorous = new Aviary<Carnivorous>();
        Aviary<Herbivore> aviaryHerbivore = new Aviary<Herbivore>();
        swimArr.add(duck);
        swimArr.add(fish);
        aviaryCarnivorous.addAnimal(dog);
        aviaryCarnivorous.addAnimal(bear);
        aviaryCarnivorous.addAnimal(fish);
        aviaryCarnivorous.getLinkAnimal(dog.getNameAnimal());

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
        System.out.println("Рыба: ");
        worker.feed(fish, meat);
        System.out.println("Рыба: ");
        worker.feed(fish, grass);
        System.out.println("Медведь: ");
        worker.feed(bear, grass);
        System.out.println("Медведь: ");
        worker.feed(bear, meat);
        for (Swim swim : swimArr) {
            swim.swim();

        }

    }


}

	
	




