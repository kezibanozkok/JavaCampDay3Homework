package concrete;

import abstractt.BaseCrud;
import entities.Campaign;

public class CampaignManager implements BaseCrud<Campaign>{
	public void add(Campaign campaign) {
		System.out.println("Yeni kampanya oluşturuldu : " + campaign.getCampaignName());
	}
	
	public void update(Campaign campaign) {
		System.out.println("Kampanya bilgileri güncellendi : " + campaign.getCampaignName() + "İndirim : " + campaign.getDiscount());
	}
	
	public void delete(Campaign campaign) {
		System.out.println("Kampanya sonlandırıldı : " + campaign.getCampaignName());
	}
}
