package polymorphism;

import java.util.ArrayList;

//다형성 : animal이라는 한 개 클래스만 불러온 것인데 다 다른 매서드 내용을 가져올 수 있는 장점
//Animal을 부모 클래스, 다른 동물들을 하위클래스로 상속받는 개념으로 함
//이때, 오버라이딩해서 하위클래스 매서드 내용은 부모클래스와는 내용을 조금 다르게 변형을 주고, 출력할 때는 부모 클래스만 하면 
//부모클래스, 자식클래스 내용이 모두 나오게 됨. 유지보수할 때도 부모클래스만 건들면 자식클래스 내용이 변형이 되므로 수월함


class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다."); //다운캐스팅
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다."); //다운캐스팅
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다."); //다운캐스팅
	}
}

public class AnimalTest1 {
	ArrayList<Animal> aniList = new ArrayList<Animal>(); //다운캐스팅

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalTest1 aTest = new AnimalTest1();
		//aTest.moveAnimal(new Human());
		//aTest.moveAnimal(new Tiger());
		//aTest.moveAnimal(new Eagle());
		
		//다운캐스팅
		aTest.addAnimal();
		System.out.println("원래 형으로 다운 캐스팅");
		aTest.testCasting();
	}

//	public void moveAnimal(Animal animal) {
//		animal.move(); 
//	}
	
	//다운캐스팅
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
	
	//다운캐스팅	
	for(Animal ani : aniList) {
		ani.move();
	}
}
	//다운캐스팅(오버라이팅으로 하는게 제일 좋고, 이걸로 안될 때 다운캐스팅을 활용)
	//instanceof :다운캐스팅에서 쓰임 / 상속관계에서 하위클래스를 새로 생성하는데, 그때의 형을 상위클래스로 함
	//하지만 상위클래스의 형을 포함하여 더 많이 불러올 수 있는 하위클래스에서의 형을 가지고 싶을 때 쓰는게 다운캐스팅(업캐스팅을 반대로 하겠다는 의미)
	//즉, 다운캐스팅을 업캐스팅으로서 원래 하위클래스의 형이어야 하는데 상위클래스의 형으로 변환한 것을 다시 원래 형인 하위클래스의 형으로 변환해주는 것
	public void testCasting() {
		for(int i =0; i<aniList.size(); i++) {
			Animal ani = aniList.get(i);
			//ani, Human 두 자료형을 비교하여 같으면 아래처럼 만들어라라는 의미
			if(ani instanceof Human) {
				Human h = (Human)ani;
				h.readBook();
			}
			else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();
			}
			else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
		    }
			else {
				System.out.println("지원되지 않는 형입니다.");
			}
	  }
    }
}

