package concrete;

import abstractt.OrderService;
import entities.Campaign;
import entities.Game;
import entities.Order;
import entities.Player;

public class OrderManager implements OrderService{

	@Override
	public void buy(Game game, Player player, Campaign campaign) {
		if (campaign != null) {
			create(new Order(1, game.getId(), player.getId(), campaign.getId()));
			System.out.println(game.getName().toUpperCase() + " isimli oyun " + player.getUsername().toUpperCase() + " isimli kullanıcı tarafından " + campaign.getCampaignName().toUpperCase() + " kampanyası dahilinde satın alındı." );
		}
		else {
			create(new Order(1, game.getId(), player.getId()));
			System.out.println(game.getName().toUpperCase() + " isimli oyun " + player.getUsername().toUpperCase() + " isimli kullanıcı tarafından satın alındı." );
		}
	}

	@Override
	public void remove(Game game, Player player) {
		System.out.println("Oyun " + game.getName().toUpperCase() + player.getUsername().toUpperCase() + " kullanıcısının listesinden çıkarıldı.");
	}

	@Override
	public void create(Order order) { 
		System.out.println(order.getId() + " numaralı sipariş oluşturuldu.");
	}
}
