package day4hw3;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1=new Gamer(2,"Öznur","Gür","guroznur","2019","123456789","1398");
		
		GamerManager gamerManager = new GamerManager(new UserValidationManager());
		
		gamerManager.add(gamer1);
		gamerManager.delete(gamer1);
		gamerManager.update(gamer1);
		
		Campaign campaign1=new Campaign(2,"Bayram kampanyası",40);
		
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign1);
		campaignManager.update(campaign1);
		
		Game game1 = new Game(1,"Duty",50);
		
		GameManager gameManager = new GameManager();
		gameManager.sell(gamer1, game1);
		gameManager.sellWithCampaign(gamer1, game1, campaign1);
				
	}

}
