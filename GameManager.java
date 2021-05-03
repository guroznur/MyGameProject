package day4hw3;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		
		System.out.println("Oyun sisteme eklendi." +game.getGameName());
	}

	@Override
	public void delete(Game game) {
		
		System.out.println("Oyun sistemden silindi." +game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		
		System.out.println("Oyun güncellendi." +game.getGameName());
		
	}

		
	@Override
	public void sell(Gamer gamer, Game game) {
		
		System.out.println(gamer.getFirstName()+"isimli oyuncu"+ game.getGameName()+"oyununu satýn aldý."+ "Fiyat:"+game.getGamePrice());
	}

	@Override
	public void sellWithCampaign(Gamer gamer, Game game, Campaign campaign) {
		double campaignPrice = game.getGamePrice()-(game.getGamePrice()*(campaign.getDiscount()/100));
		System.out.println(gamer.getFirstName()+"isimli oyuncu"+ game.getGameName()+"oyununu satýn aldý."+ "Kmpanyalý Fiyat:"+campaignPrice);
		
	}

	
}
