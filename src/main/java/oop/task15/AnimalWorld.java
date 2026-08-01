package oop.task15;

public class AnimalWorld
{
	public static void main(String[] args) {

		getAnimalVoice(new Dog());
		getAnimalVoice(new Cat());

		Animal animal = new Dog();
		getAnimalVoice(animal);
	}

	public static void getAnimalVoice(Animal animal) {
		System.out.println(animal.voice());
	}
}
