package concrete;

import abstractt.BaseCrud;
import entities.Game;

public class GameManager implements BaseCrud<Game>{

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi : " + game.getName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi : " + game.getName());
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun kaldırıldı : " + game.getName());
	}
}
