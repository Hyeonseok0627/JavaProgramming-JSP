package practice;

public class Card {
	private static int serialNum = 1000;
	private String cardName;
	private int cardNumber;
	
	public Card() {
		this.cardNumber = ++serialNum;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Card.serialNum = serialNum;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	
}
