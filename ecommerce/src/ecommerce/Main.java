package ecommerce;

import ecommerce.business.concretes.UserCheckManager;
import ecommerce.business.concretes.UserManager;
import ecommerce.core.GoogleAuthManagerAdapter;
import ecommerce.dataAccess.concretes.HibernateUserDao;
import ecommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1, "Keziban", "Özkök", "k.ozkok@gmail.com", "123456");
		UserManager userManager = new UserManager(new HibernateUserDao(), new UserCheckManager(new HibernateUserDao()), new GoogleAuthManagerAdapter());
		userManager.signup(user);
		
		userManager.loginWithGoogle("k.ozkok@gmail.com", "123456");

	}

}
