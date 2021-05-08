package concrete;

import abstractt.PlayerCheckService;
import entities.Player;

public class PlayerCheckManager implements PlayerCheckService{

	@Override
	public boolean isValidUser(Player player) {
		if (player.getNationalityId().length() == 11 && !player.getFirstName().isEmpty() && 
				!player.getLastName().isEmpty() && player.getYearOfBirth() <= 2003) {
			return true;
		}
		return false;
	}

}
