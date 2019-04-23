package battleEngine;

public class tester {
	
	public static void main(String args[]){
		
		Card Card2= new Card();
		Card2.setType("Fire");
		Card2.setRace("Warrior");
		Card2.setHP(40);
		Card2.setSpeed(5);
		Card2.setOffense(15);
		Card2.setDefense(5);
		
		Card Card1= new Card();
		Card1.setType("Earth");
		Card1.setRace("Warrior");
		Card1.setHP(60);
		Card1.setSpeed(5);
		Card1.setOffense(15);
		Card1.setDefense(5);
		
		bEngine e1 = new bEngine(Card1, Card2);
		System.out.println(e1.retWinner());
		System.out.println(e1.battleText());
		
	}

}
