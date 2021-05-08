package abstractt;

import entities.Campaign;
import entities.Game;
import entities.Order;
import entities.Player;

public interface OrderService {
	
	public void create(Order order);
	public void buy(Game game, Player player, Campaign campaign);
	public void remove(Game game, Player player);
}
