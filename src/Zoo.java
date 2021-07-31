

import Animals.*;
import Food.*;
import Interface.Swim;

import java.util.*;


public abstract class Zoo implements Swim {

    public static void main(String[] args) {
        // Объекты и переменные
        List<Swim> swimArr = new ArrayList<>();
        Meat steak= new Meat(5,"стейк");
        Grass weed = new Grass(5,"сорняк");
        Worker worker = new Worker();
        Horse horse = new Horse(20,50,"Цезарь");
        Bear bear = new Bear(10,10,"Балу");
        Cow cow = new Cow(5,40,"Мун");
        Dog dog = new Dog(100,10,"Евгений");
        Duck duck = new Duck(10,20,"Савелий");
        Fish fish = new Fish(10,20,"Аркадий");

        //Обявление вальера (хищьник, травоядный)
        Aviary<Carnivorous> aviaryCarnivorous = new Aviary<Carnivorous>();
        Aviary<Herbivore> aviaryHerbivore = new Aviary<Herbivore>();


        //массив Swim
        swimArr.add(duck);
        swimArr.add(fish);

        //Размеры вольеров
        System.out.println(System.lineSeparator());
        System.out.println("Размеры вольеров для плотоядных: ");
        aviaryCarnivorous.getAllSize();
        System.out.println("----------------------------------");
        System.out.println("Размеры вольеров для травоядных: ");
        aviaryHerbivore.getAllSize();

        //Заполнение хешмапы
        aviaryCarnivorous.addAnimal(bear);
        aviaryCarnivorous.addAnimal(dog);
        aviaryCarnivorous.addAnimal(fish);
        aviaryHerbivore.addAnimal(duck);




        //getVoice
        System.out.println(System.lineSeparator());
        System.out.println("---------Рабочий подзывает животных-----------");
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
        //Удаление из хешмапы
        aviaryCarnivorous.removeAnimal(bear, bear.getNameAnimal());

        //получение ссылки (откликнуться на кличку)
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

	
	




