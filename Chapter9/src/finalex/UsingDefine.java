package finalex;

public class UsingDefine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Define.GOOD_MORING);
		System.out.println("최솟값은 " + Define.MIN + "입니다.");
		System.out.println("초댓값은 " + Define.MAX + "입니다.");
		System.out.println("수학 과목 코드 값은 " + Define.MATH + "입니다."); //숫자로 대입이 아니고 상수로 정의해놓으면 MATH값만 바꾸면 되는거라 훨씬 수월함
		System.out.println("영어 과목 코드 값은 " + Define.ENG + "입니다.");
	}
}
