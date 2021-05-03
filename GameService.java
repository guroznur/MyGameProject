package day4hw3;

public interface GameService {
	
	void add(Game game);
	void delete(Game game);
	void update(Game game);
	void sell(Gamer gamer,Game game);
	void sellWithCampaign(Gamer gamer,Game game,Campaign campaign);

}
