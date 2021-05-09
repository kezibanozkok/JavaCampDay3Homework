package ecommerce.business.abstracts;

import ecommerce.entities.concretes.User;

public interface UserService {
	void signup(User user);
	void loginWithGoogle(String email, String password);
	void login(String email, String password);
	void sendVerificationEmail(String email);
	void verifyEmail(int verifyingCode);
}
