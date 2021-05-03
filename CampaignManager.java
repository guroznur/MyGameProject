package day4hw3;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("Kampanya sisteme eklendi." +campaign.getCampaignName());
			
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println("Kampanya sistemden silindi." +campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("Kampanya güncellendi." +campaign.getCampaignName());
		
	}

}
