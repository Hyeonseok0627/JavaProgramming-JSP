package exception;

public class IDFormatTest {
	private String userId;
	private String PW;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) throws IDFormatException {
		if (userId == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		} else if (userId.length() < 8 || userId.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
		}
		this.userId = userId;
	}
	
	public String getPW() {
		return PW;
	}

	public void setPW(String PW) throws PasswordException{
		if (PW == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		} else if (PW.length() <= 5) {
			throw new PasswordException("비밀번호는 5글자 이하일 수 없습니다.");
		} else if (PW.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 문자열로만 이루어질 수 없습니다.");
		}
		this.PW = PW;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDFormatTest test = new IDFormatTest();
		String userId = null;
		try {
			test.setUserId(userId);
		} catch (IDFormatException e) {
			System.out.println(userId+" : "+e.getMessage());
		}

		userId = "1234567";
		try {
			test.setUserId(userId);
		} catch (IDFormatException e) {
			System.out.println(userId+" : "+e.getMessage());
		}
		
		String pw = null;
		try {
			test.setPW(pw);
		} catch (PasswordException e) {
			System.out.println(pw+" : "+e.getMessage());
		}
		
		pw = "12345";
		try {
			test.setPW(pw);
		} catch (PasswordException e) {
			System.out.println(pw+" : "+e.getMessage());
		}
		
		pw = "abcdEFG";
		try {
			test.setPW(pw);
		} catch (PasswordException e) {
			System.out.println(pw+" : "+e.getMessage());
		}
	}



}
