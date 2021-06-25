

import Animals.*;
import Food.*;
import Interface.Swim;

public abstract class Zoo implements Swim {

	public static void main(String[] args) {
		// Объекты и переменные
		Swim[] swimArr = new Swim[5];
		swimArr[0]= new Fish();
		System.out.println(swimArr[0]);
		Meat meat = new Meat();
		Grass grass = new Grass();
		Worker worker = new Worker();
		Horse horse = new Horse();
		Bear bear = new Bear();
		Cow cow = new Cow();
		Dog dog = new Dog();
		Duck duck = new Duck();
		Fish fish = new Fish();		
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
		}
	
		


	}	

	
	




