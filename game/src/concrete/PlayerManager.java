package concrete;

import abstractt.BaseCrud;
import abstractt.PlayerCheckService;
import entities.Player;

public class PlayerManager implements BaseCrud<Player>{
	private PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}
	
	@Override
	public void add(Player player) {
		if(playerCheckService.isValidUser(player)) {
			System.out.println(player.getUsername() + " : kaydınız gerçekleşmiştir.");
		}
		else {
			System.out.println("Bilgilerinizin doğruluğunu kontrol edip tekrar deneyiniz.");
		}
	}
	
	@Override
	public void delete(Player player) {
		System.out.println(player.getUsername() + " : hesabınız başarıyla silinmiştir.");
	}
	
	@Override
	public void update(Player player) {
		System.out.println(player.getUsername() + " : bilgileriniz başarıyla güncellenmiştir.");
	}
}
