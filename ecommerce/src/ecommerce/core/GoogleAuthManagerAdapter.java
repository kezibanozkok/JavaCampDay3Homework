package ecommerce.core;

import ecommerce.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService{

	@Override
	public void authenticateWithGoogle(String email, String password) {
		GoogleAuthManager manager = new GoogleAuthManager();
		manager.authenticate(email, password);
	}

}
