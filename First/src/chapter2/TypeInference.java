package chapter2;

public class TypeInference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// var : 자료형인 int(정수), double(실수형), String(문자열)을 쓰지않고 변수를 사용하게끔 하는 방법
		var i = 10;
		var j = 10.0;
		var str = "hello";
		String str2 = "String"; //String의 문자열은 "" 로 표시, ''로 표시하면 에러
		
		System.out.println(i); //syso 입력 후 ctrl+space바 입력하면 자동완성됨
		System.out.println(j);
		System.out.println(str);
	}

}
