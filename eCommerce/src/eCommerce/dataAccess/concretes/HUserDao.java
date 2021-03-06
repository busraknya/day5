package eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HUserDao implements UserDao{
	
	List<User> users=new ArrayList<User>();

	@Override
	public void add(User user) {
		System.out.println("Kullanıcı eklendi: " + user.getEmail());

	}

	@Override
	public void update(User user) {
		System.out.println("Kullanıcı güncellendi: " + user.getEmail());

	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanıcı sisteme silindi: " + user.getEmail());

	}

	@Override
	public List<User> getAll() {
		return this.users;
	}

}
