package exception;

public class IDFormatException extends Exception{
	
	public IDFormatException(String message){
		super(message); //Exception 상위클래스의 message()매서드를 받아온다는 의미
	}
}
