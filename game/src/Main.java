import concrete.OrderManager;
import concrete.PlayerCheckManager;
import concrete.PlayerManager;
import entities.Campaign;
import entities.Game;
import entities.Order;
import entities.Player;

public class Main {

	public static void main(String[] args) {
		Player player1 = new Player(1, "Murat", "Yıldırım", "myildirim", "11111111111", 1972);
		Player player2 = new Player(1, "Beyza", "Yıldız", "byzyildiz", "12345678910", 2010);
		
		PlayerManager playerManager = new PlayerManager(new PlayerCheckManager());
		playerManager.add(player1);
		playerManager.add(player2);
		
		Campaign campaign1 = new Campaign(1, "%20 İndirim", 20);
		//Campaign campaign2 = new Campaign(2, "%10 İndirim", 10);
		
		Game game1 = new Game(1, "Minecraft", 15);
		Game game2 = new Game(2, "The Sims 2: Super Collection", 100);
		
		OrderManager orderManager = new OrderManager();
		orderManager.buy(game2, player1, campaign1);
		orderManager.remove(game2, player1);
		orderManager.buy(game1, player1, null);
		
		player1.setUsername("myldrm");
		playerManager.update(player1);
	
	}

}
