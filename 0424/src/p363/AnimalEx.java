package p363;

public class AnimalEx {
	public static void animalSound(Animal animal) {
		animal.sound();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog = new Dog();
		dog.sound();
		
		Animal ani= new Dog();
		ani.sound();
		
		animalSound(ani);
	}

}
