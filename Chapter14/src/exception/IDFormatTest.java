package exception;

public class IDFormatTest {

	private String userID;
	
	public String getUserID(){
		return userID;
	}
	
	//아이디에 대한 제약 조건 구현
	public void setUserID(String userID) throws IDFormatException{ //throws IDFormatException : 해당 예외를 setUserID()매서드가 호출될 때 처리하도록 미룸
		
		if(userID == null){
			//해당 exception을 발생시킨다
			throw new IDFormatException("아이디는 null 일 수 없습니다");
		}
		// || : or 개념
		else if( userID.length() < 8 || userID.length() > 20){
			//해당 exception을 발생시킨다
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요");
		}
		
		this.userID = userID;
	}
	
	// 위에서 만든 exception 클래스를 사용한 부분
	public static void main(String[] args) {

		IDFormatTest test = new IDFormatTest();
		String userID = null;
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
