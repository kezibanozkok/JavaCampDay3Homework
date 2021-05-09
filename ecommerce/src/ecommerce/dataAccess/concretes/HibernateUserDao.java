package ecommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ecommerce.dataAccess.abstracts.UserDao;
import ecommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	List<User> userList = new ArrayList<User>();

	@Override
	public void add(User user) {
		System.out.println("Kullanıcı eklendi : " + user.getFirstName() + " " + user.getLastName());
		userList.add(user);
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanıcı bilgileri güncellendi : " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		if (userList.remove(user)) {
			System.out.println("Kullanıcı silindi : " + user.getFirstName() + " " + user.getLastName());
		}
	}

	@Override
	public List<User> getAll() {
		return userList;
	}

	@Override
	public User getOne(int id) {
		for(User user : userList) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}	
}
