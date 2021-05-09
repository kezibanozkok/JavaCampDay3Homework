package ecommerce.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ecommerce.business.abstracts.UserCheckService;
import ecommerce.business.abstracts.UserService;
import ecommerce.core.AuthService;
import ecommerce.dataAccess.abstracts.UserDao;
import ecommerce.entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;
	private UserCheckService userCheckService;
	private AuthService authService;
	List<User> users = new ArrayList<User>();

	public UserManager(UserDao userDao, UserCheckService userCheckService, AuthService authService) {
		this.userDao = userDao;
		this.userCheckService = userCheckService;
		this.authService = authService;
	}

	@Override
	public void signup(User user) {
		if (!userCheckService.checkfirstName(user.getFirstName()) || user.getFirstName() == null) {
			System.out.println("İsim en az 2 karakterden oluşmalıdır.");
			return;
		}
		else if (!userCheckService.checklastName(user.getLastName()) || user.getLastName() == null) {
			System.out.println("Soyisim en az 2 karakterden oluşmalıdır.");
			return;
		}
		else if (!userCheckService.checkEmail(user.getEmail()) || user.getEmail() == null) {
			System.out.println("Geçerli bir email giriniz.");
			return;
		}
		else if (!userCheckService.checkPassword(user.getPassword()) || user.getPassword() == null) {
			System.out.println("Şifreniz en az 6 karakterden oluşmalıdır.");
		}
		else if (userCheckService.isEmailInUse(user.getEmail())) {
			System.out.println("Bu email kullanılmaktadır.");
		}
		else {
			userDao.add(user);
			System.out.println("Kayıt başarılı!");
			sendVerificationEmail(user.getEmail());
		}
	}

	@Override
	public void login(String email, String password) {
		for (User user : userDao.getAll()) {
			if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
				System.out.println("Giriş başarılı!");
				break;
			}
		}
		System.out.println("Email ya da şifre hatalı!");
	}

	@Override
	public void loginWithGoogle(String email, String password) {
		authService.authenticateWithGoogle(email, password);
	}
	
	@Override
	public void sendVerificationEmail(String email) {
		int verifyingCode = 1000+(int)(Math.random()* 9999);
		System.out.println("Doğrulama kodu gönderildi : " + email);
		System.out.println("Doğrulama kodu : " + verifyingCode);
		verifyEmail(verifyingCode);
	}

	@Override
	public void verifyEmail(int verifyingCode) {
		System.out.println("Doğrulama kodunu giriniz : ");
		Scanner scanner = new Scanner(System.in);
		
		if (scanner.nextInt() == verifyingCode) {
			System.out.println("Email doğrulandı.");
		}
		else {
			System.out.println("Doğrulama başarısız.");
		}
		scanner.close();
	}
}
