package gamelevel;

//추상 클래스
public abstract class PlayerLevel {

	//추상 매서드
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	//템플릿 매서드
	final public void go(int count) {
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	}
}
