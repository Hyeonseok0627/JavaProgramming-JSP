package practice;

public class CardCompany {
	private static CardCompany instance = new CardCompany();
	private static int serialNum = 1000;
	private CardCompany() {}
	
	public static CardCompany getInstance() {
		return instance;
	}
	public Card createCard() {
		Card card = new Card();
		card.setCardNumber(++serialNum);
		return card;
	}
}
