package practice;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("말티즈","말티즈"));
		dogs.add(new Dog("푸들","푸들"));
		dogs.add(new Dog("포메라니안","포메라니안"));
		dogs.add(new Dog("치와와","치와와"));
		dogs.add(new Dog("진돗개","진돗개"));
		
		for(Dog dog : dogs) {
			System.out.println(dog.showDogInfo());
		}
	}

}









